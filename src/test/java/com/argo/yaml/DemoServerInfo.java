package com.argo.yaml;

/**
 * Created by yamingd on 9/9/15.
 */
public class DemoServerInfo {

    private String name;
    private String master;
    private String slave;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getSlave() {
        return slave;
    }

    public void setSlave(String slave) {
        this.slave = slave;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemoServerInfo{");
        sb.append("name='").append(name).append('\'');
        sb.append(", master='").append(master).append('\'');
        sb.append(", slave='").append(slave).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
