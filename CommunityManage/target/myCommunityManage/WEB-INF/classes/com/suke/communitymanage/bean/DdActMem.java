package com.suke.communitymanage.bean;

public class DdActMem {
    private Integer id;

    private String memId;

    private Integer activityId;
 private  Activity activity;

    @Override
    public String toString() {
        return "DdActMem{" +
                "id=" + id +
                ", memId='" + memId + '\'' +
                ", activityId=" + activityId +
                ", activity=" + activity +
                '}';
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}