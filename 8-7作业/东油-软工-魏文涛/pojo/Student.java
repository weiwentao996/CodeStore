package com.train.day20.pojo;

import java.util.List;

public class Student {
    private Integer Id;
    private String sname;
    private String ssex;
    private Integer sage;
    private String sdept;

    private List<Course> listInfo;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public List<Course> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<Course> listInfo) {
        this.listInfo = listInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage=" + sage +
                ", sdept='" + sdept + '\'' +
                ", listInfo=" + listInfo +
                '}';
    }
}
