package com.argo.yaml;

/**
 * Created by yamingd on 9/9/15.
 */
public class YamlTemplateTest {

    @org.junit.Test
    public void testLoad() throws Exception {
        DemoInfo demoInfo = YamlTemplate.load(DemoInfo.class, "test.yaml");
        System.out.print(demoInfo);
    }
}
