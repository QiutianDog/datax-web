package com.wugui.datax.admin.tool.meta;

/**
 * Oceanbase 数据库（Oracle模式） meta信息查询
 *
 * @author langxi.feng
 * @since 2024-11-06 09:56
 */
public class OceanBaseDatabaseMeta extends BaseDatabaseMeta implements DatabaseInterface {

    private volatile static OceanBaseDatabaseMeta single;

    public static OceanBaseDatabaseMeta getInstance() {
        if (single == null) {
            synchronized (OceanBaseDatabaseMeta.class) {
                if (single == null) {
                    single = new OceanBaseDatabaseMeta();
                }
            }
        }
        return single;
    }

    @Override
    public String getSQLQueryComment(String schemaName, String tableName, String columnName) {
        return String.format("select B.comments \n" +
                "  from user_tab_columns A, user_col_comments B\n" +
                " where a.COLUMN_NAME = b.column_name\n" +
                "   and A.Table_Name = B.Table_Name\n" +
                "   and A.Table_Name = upper('%s')\n" +
                "   AND A.column_name  = '%s'", tableName, columnName);
    }

    @Override
    public String getSQLQueryPrimaryKey() {
        return "select cu.column_name from user_cons_columns cu, user_constraints au where cu.constraint_name = au.constraint_name and au.owner = ? and au.constraint_type = 'P' and au.table_name = ?";
    }

    @Override
    public String getSQLQueryTablesNameComments() {
        return "select table_name,comments from user_tab_comments";
    }

    @Override
    public String getSQLQueryTableNameComment() {
        return "select table_name,comments from user_tab_comments where table_name = ?";
    }

    @Override
    public String getSQLQueryTables(String... tableSchema) {
        return "select table_name from user_tab_comments";
    }

    @Override
    public String getSQLQueryTableSchema(String... args) {
        return "select 'HDSP_PRO' table_name from dual";
    }


    @Override
    public String getSQLQueryTables() {
        return "select table_name from user_tab_comments";
    }


    @Override
    public String getSQLQueryColumns(String... args) {
        return "select table_name,comments from user_tab_comments where table_name = ?";
    }


}
