package com.wugui.datax.admin.tool.datax.reader;

import java.util.Map;

/**
 * e.g
 *
 * @author langxi.feng
 * @since 2024-11-06 10:04
 */
public class OceanBaseReader extends BaseReaderPlugin implements DataxReaderInterface {

    @Override
    public String getName() {
        return "oceanbasev10reader";
    }

    @Override
    public Map<String, Object> sample() {
        return null;
    }
}
