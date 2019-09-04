package com.hero.pojo;

import java.util.List;

public class Hero {
    private Long id;

    private String ukName;

    private String nickname;

    private String tinyImg;

    private Byte magicPower;

    private Byte physicPower;

    private Byte defencePower;

    private Byte handHard;

    public void fun(){

    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", ukName='" + ukName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", tinyImg='" + tinyImg + '\'' +
                ", magicPower=" + magicPower +
                ", physicPower=" + physicPower +
                ", defencePower=" + defencePower +
                ", handHard=" + handHard +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUkName() {
        return ukName;
    }

    public void setUkName(String ukName) {
        this.ukName = ukName == null ? null : ukName.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTinyImg() {
        return tinyImg;
    }

    public void setTinyImg(String tinyImg) {
        this.tinyImg = tinyImg == null ? null : tinyImg.trim();
    }

    public Byte getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(Byte magicPower) {
        this.magicPower = magicPower;
    }

    public Byte getPhysicPower() {
        return physicPower;
    }

    public void setPhysicPower(Byte physicPower) {
        this.physicPower = physicPower;
    }

    public Byte getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(Byte defencePower) {
        this.defencePower = defencePower;
    }

    public Byte getHandHard() {
        return handHard;
    }

    public void setHandHard(Byte handHard) {
        this.handHard = handHard;
    }

}