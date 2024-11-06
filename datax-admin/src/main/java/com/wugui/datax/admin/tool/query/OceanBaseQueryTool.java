package com.wugui.datax.admin.tool.query;

import com.wugui.datax.admin.entity.JobDatasource;

import java.sql.SQLException;

/**
 * Oceanbase数据库（Oracle模式）使用的查询工具
 *
 * @author langxi.feng
 * @since 2024-11-06 10:00
 */
public class OceanBaseQueryTool extends BaseQueryTool implements QueryToolInterface {

    /**
     * 构造方法
     *
     * @param jobDatasource
     */
    OceanBaseQueryTool(JobDatasource jobDatasource) throws SQLException {
        super(jobDatasource);
    }

}
