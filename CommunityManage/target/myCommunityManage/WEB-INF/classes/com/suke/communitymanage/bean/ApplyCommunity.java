package com.suke.communitymanage.bean;


public class ApplyCommunity extends ApplyCommunityKey {
    private String applyTime;

    private Integer status;
private  Community community;

    @Override
    public String toString() {
        return "ApplyCommunity{" +
                "applyTime='" + applyTime + '\'' +
                ", status=" + status +
                ", community=" + community +
                '}';
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}