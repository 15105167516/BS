package com.suke.communitymanage.bean;

public class ApplyCommunity {
    private Integer temId;

    private String temUserId;

    private Integer temComId;

    private String applyTime;

    private String status;

    public Integer getTemId() {
        return temId;
    }

    public void setTemId(Integer temId) {
        this.temId = temId;
    }

    public String getTemUserId() {
        return temUserId;
    }

    public void setTemUserId(String temUserId) {
        this.temUserId = temUserId == null ? null : temUserId.trim();
    }

    public Integer getTemComId() {
        return temComId;
    }

    public void setTemComId(Integer temComId) {
        this.temComId = temComId;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}