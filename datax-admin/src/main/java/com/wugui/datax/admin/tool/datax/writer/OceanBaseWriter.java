package com.wugui.datax.admin.tool.datax.writer;

import java.util.Map;

/**
 * oceanbase writer构建类
 *
 * @author langxi.feng
 * @since 2024-11-06 10:01
 */
public class OceanBaseWriter extends BaseWriterPlugin implements DataxWriterInterface {

    @Override
    public String getName() {
        return "oceanbasev10writer";
    }

    @Override
    public Map<String, Object> sample() {
        return null;
    }

}
