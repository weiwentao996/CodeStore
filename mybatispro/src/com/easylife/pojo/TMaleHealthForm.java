package com.easylife.pojo;

public class TMaleHealthForm {
    private Integer id;

    private Integer empId;

    private String heart;

    private String liver;

    private String spleen;

    private String lung;

    private String kidney;

    private String prostate;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart == null ? null : heart.trim();
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver == null ? null : liver.trim();
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen == null ? null : spleen.trim();
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung == null ? null : lung.trim();
    }

    public String getKidney() {
        return kidney;
    }

    public void setKidney(String kidney) {
        this.kidney = kidney == null ? null : kidney.trim();
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate == null ? null : prostate.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}