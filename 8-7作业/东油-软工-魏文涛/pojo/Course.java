package com.train.day20.pojo;

public class Course implements Comparable<Course>{
    private String con;
    private String cname;
    private int score;

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Course{" +
                "con='" + con + '\'' +
                ", cname='" + cname + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Course o) {
        return this.con.compareTo(o.getCon());
    }
}
