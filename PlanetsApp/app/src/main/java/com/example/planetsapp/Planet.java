package com.example.planetsapp;

public class Planet {
    private String planetname,mooncount;
    private int planetimage;

    public Planet(String planetname,String mooncount,int planetimage) {
        this.planetname = planetname;
        this.mooncount=mooncount;
        this.planetimage=planetimage;
    }

    public String getPlanetname() {
        return planetname;
    }

    public void setPlanetname(String planetname) {
        this.planetname = planetname;
    }

    public String getMooncount() {
        return mooncount;
    }

    public int getPlanetimage() {
        return planetimage;
    }

    public void setPlanetimage(int planetimage) {
        this.planetimage = planetimage;
    }

    public void setMooncount(String mooncount) {
        this.mooncount = mooncount;
    }
}
