package com.train.day20.pojo;

public class StuCourseGrade {
    private String sno;
    private String sname;
    private String cname;
    private Integer grade;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StuCourseGrade{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", cname='" + cname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
