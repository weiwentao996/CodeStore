package com.hero.pojo;

public class HeroSkin {
    private Long id;

    private String skinName;

    private String bigImg;

    private String tinyImg;

    private String ukName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkinName() {
        return skinName;
    }

    public void setSkinName(String skinName) {
        this.skinName = skinName == null ? null : skinName.trim();
    }

    public String getBigImg() {
        return bigImg;
    }

    public void setBigImg(String bigImg) {
        this.bigImg = bigImg == null ? null : bigImg.trim();
    }

    public String getTinyImg() {
        return tinyImg;
    }

    public void setTinyImg(String tinyImg) {
        this.tinyImg = tinyImg == null ? null : tinyImg.trim();
    }

    public String getUkName() {
        return ukName;
    }

    public void setUkName(String ukName) {
        this.ukName = ukName == null ? null : ukName.trim();
    }

    @Override
    public String toString() {
        return "HeroSkin{" +
                "id=" + id +
                ", skinName='" + skinName + '\'' +
                ", bigImg='" + bigImg + '\'' +
                ", tinyImg='" + tinyImg + '\'' +
                ", ukName='" + ukName + '\'' +
                '}';
    }
}