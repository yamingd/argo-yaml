package com.argo.yaml;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by yamingd on 9/9/15.
 */
public class YamlTemplate {

    /**
     * 加载并序列化为 T
     * @param type 目标配置类
     * @param fileName 配置文件(.yaml)
     * @param <T> 返回的目标类型
     * @return T 目标实例
     * @throws IOException 抛出IOException
     */
    public static <T> T load(Class<T> type, String fileName) throws IOException {

        ClassLoader classLoader = getDefaultClassLoader();
        InputStream input = classLoader.getResourceAsStream(fileName);
        if (input == null){
            throw new IOException("File not found. fileName=" + fileName);
        }
        Yaml yaml = new Yaml();
        T o = yaml.loadAs(input, type);

        return o;

    }

    /**
     * 加载并序列化为 T
     * @param fileName 配置文件(.yaml)
     * @return YamlMap
     * @throws IOException 抛出IOException
     */
    public static YamlMap load(String fileName) throws IOException {

        ClassLoader classLoader = getDefaultClassLoader();
        InputStream input = classLoader.getResourceAsStream(fileName);
        if (input == null){
            throw new IOException("File not found. fileName=" + fileName);
        }
        Yaml yaml = new Yaml();
        Map o = (Map) yaml.load(input);

        return new YamlMap(o);

    }

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }
        catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = YamlTemplate.class.getClassLoader();
            if (cl == null) {
                // getClassLoader() returning null indicates the bootstrap ClassLoader
                try {
                    cl = ClassLoader.getSystemClassLoader();
                }
                catch (Throwable ex) {
                    // Cannot access system ClassLoader - oh well, maybe the caller can live with null...
                }
            }
        }
        return cl;
    }

}
