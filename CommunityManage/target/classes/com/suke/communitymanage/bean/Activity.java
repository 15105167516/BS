package com.suke.communitymanage.bean;

import java.util.Date;

public class Activity {
    private Integer id;

    private String activityTheme;

    private String activityIntroduction;

    private Integer actPeopleCount;

    private String activityAddress;

    private Date activityEndTime;

    private Date activityStartTime;

    private String activityImg;

    private Integer activiyCommityId;

    private Community community;

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", activityTheme='" + activityTheme + '\'' +
                ", activityIntroduction='" + activityIntroduction + '\'' +
                ", actPeopleCount=" + actPeopleCount +
                ", activityAddress='" + activityAddress + '\'' +
                ", activityEndTime=" + activityEndTime +
                ", activityStartTime=" + activityStartTime +
                ", activityImg='" + activityImg + '\'' +
                ", activiyCommityId=" + activiyCommityId +
                ", community=" + community +
                '}';
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityTheme() {
        return activityTheme;
    }

    public void setActivityTheme(String activityTheme) {
        this.activityTheme = activityTheme == null ? null : activityTheme.trim();
    }

    public String getActivityIntroduction() {
        return activityIntroduction;
    }

    public void setActivityIntroduction(String activityIntroduction) {
        this.activityIntroduction = activityIntroduction == null ? null : activityIntroduction.trim();
    }

    public Integer getActPeopleCount() {
        return actPeopleCount;
    }

    public void setActPeopleCount(Integer actPeopleCount) {
        this.actPeopleCount = actPeopleCount;
    }

    public String getActivityAddress() {
        return activityAddress;
    }

    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress == null ? null : activityAddress.trim();
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public String getActivityImg() {
        return activityImg;
    }

    public void setActivityImg(String activityImg) {
        this.activityImg = activityImg == null ? null : activityImg.trim();
    }

    public Integer getActiviyCommityId() {
        return activiyCommityId;
    }

    public void setActiviyCommityId(Integer activiyCommityId) {
        this.activiyCommityId = activiyCommityId;
    }
}