package com.suke.communitymanage.bean;

public class Activity {
    private Integer id;

    private String activityTheme;

    private String activityIntroduction;

    private Integer actPeopleCount;

    private String activityAddress;

    private String activityStartOverTime;

    private String activityImg;

    private Integer activiyCommityId;

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

    public String getActivityStartOverTime() {
        return activityStartOverTime;
    }

    public void setActivityStartOverTime(String activityStartOverTime) {
        this.activityStartOverTime = activityStartOverTime == null ? null : activityStartOverTime.trim();
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