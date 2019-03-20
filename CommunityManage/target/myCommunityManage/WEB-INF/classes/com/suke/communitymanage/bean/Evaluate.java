package com.suke.communitymanage.bean;

public class Evaluate {
    private Integer id;

    private String memId;

    private String memEva;

    private String evaTime;

    private Integer evaLeven;

    private Integer actId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId == null ? null : memId.trim();
    }

    public String getMemEva() {
        return memEva;
    }

    public void setMemEva(String memEva) {
        this.memEva = memEva == null ? null : memEva.trim();
    }

    public String getEvaTime() {
        return evaTime;
    }

    public void setEvaTime(String evaTime) {
        this.evaTime = evaTime == null ? null : evaTime.trim();
    }

    public Integer getEvaLeven() {
        return evaLeven;
    }

    public void setEvaLeven(Integer evaLeven) {
        this.evaLeven = evaLeven;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }
}