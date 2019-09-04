package com.hero.pojo;

public class Ht {


    public static void main(String[] args) {
        Hero hero = new Hero(){
            @Override
            public void fun() {
                super.fun();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };
    }
    private Long id;

    private Long hid;

    private Long tid;

    private Hero hero;

    private String heroType;

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Ht{" +
                "id=" + id +
                ", hid=" + hid +
                ", tid=" + tid +
                ", hero=" + hero +
                ", heroType='" + heroType + '\'' +
                '}';
    }
}