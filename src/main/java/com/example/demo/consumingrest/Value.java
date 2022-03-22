package com.example.demo.consumingrest;

public class Value {
    private Long id;
    private String uid;
    private String type;
    private String rh_factor;
    private String group;

    public Value() {}

    public void setId(Long id) {
        this.id = id;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setRh_factor(String rh_factor) {
        this.rh_factor = rh_factor;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public Long getId() {
        return id;
    }
    public String getUid() {
        return uid;
    }
    public String getType() {
        return type;
    }
    public String getRh_factor() {
        return rh_factor;
    }
    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", type='" + type + '\'' +
                ", rh_factor='" + rh_factor + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
