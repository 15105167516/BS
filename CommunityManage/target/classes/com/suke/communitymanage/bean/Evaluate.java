package com.suke.communitymanage.bean;

public class Evaluate {
    private Integer id;

    private String memId;

    private String memEva;

    private String evaTime;

    private String evaScore;

    private Integer actId;
    private Member member;
    @Override
    public String toString() {
        return "Evaluate{" +
                "id=" + id +
                ", memId='" + memId + '\'' +
                ", memEva='" + memEva + '\'' +
                ", evaTime='" + evaTime + '\'' +
                ", evaScore='" + evaScore + '\'' +
                ", actId=" + actId +
                ", member=" + member +
                '}';
    }



    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

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

    public String getEvaScore() {
        return evaScore;
    }

    public void setEvaScore(String evaScore) {
        this.evaScore = evaScore == null ? null : evaScore.trim();
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }
}