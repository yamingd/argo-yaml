package com.argo.yaml;

import java.util.List;
import java.util.Map;

/**
 * Created by yamingd on 9/9/15.
 */
public class DemoInfo {

    private Integer maxActive;
    private Integer maxIdle;
    private Integer timeout;
    private String host;
    private Integer port;
    private Boolean testOnBorrow;
    private Boolean testWhileIdle;

    private Map ems;
    private List<DemoServerInfo> ms;

    public Integer getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(Boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public Boolean getTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(Boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public Map getEms() {
        return ems;
    }

    public void setEms(Map ems) {
        this.ems = ems;
    }

    public List<DemoServerInfo> getMs() {
        return ms;
    }

    public void setMs(List<DemoServerInfo> ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemoInfo{");
        sb.append("maxActive=").append(maxActive);
        sb.append(", maxIdle=").append(maxIdle);
        sb.append(", timeout=").append(timeout);
        sb.append(", host='").append(host).append('\'');
        sb.append(", port=").append(port);
        sb.append(", testOnBorrow=").append(testOnBorrow);
        sb.append(", testWhileIdle=").append(testWhileIdle);
        sb.append(", ems=").append(ems);
        sb.append(", ms=").append(ms);
        sb.append('}');
        return sb.toString();
    }
}
