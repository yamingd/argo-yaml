package com.argo.yaml;

import java.util.Map;

/**
 * Created by yamingd on 9/9/15.
 */
public class YamlMap {

    private Map<String, Object> data = null;

    public YamlMap(Map<String, Object> data) {
        if (data == null){
            throw new IllegalArgumentException("data is NULL.");
        }
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String key){
        Object temp = this.data.get(key);
        if(temp == null){
            return null;
        }
        return (T) temp;
    }

    public <T> T get(String key, T defaultValue){
        Object temp = this.data.get(key);
        if(temp == null){
            return defaultValue;
        }
        return (T) temp;
    }

    /**
     *
     * @param key 配置Key
     * @return Integer
     */
    public Integer getInt(String key){
        Integer val = get(key);
        return val;
    }

    public Integer getInt(String key, Integer defaultVal){
        Integer val = get(key, defaultVal);
        return val;
    }

    /**
     *
     * @param key 配置Key
     * @return Long
     */
    public Long getLong(String key){
        Long val = get(key);
        return val;
    }

    public Long getLong(String key, Long defaultVal){
        Long val = get(key, defaultVal);
        return val;
    }

    /**
     *
     * @param key 配置Key
     * @return String
     */
    public String getString(String key){
        String val = get(key);
        return val;
    }

    public String getLong(String key, String defaultVal){
        String val = get(key, defaultVal);
        return val;
    }

    /**
     *
     * @param key 配置Key
     * @return Boolean
     */
    public Boolean getBoolean(String key){
        Boolean val = get(key);
        return val;
    }

    public Boolean getBoolean(String key, Boolean defaultVal){
        Boolean val = get(key, defaultVal);
        return val;
    }
}
