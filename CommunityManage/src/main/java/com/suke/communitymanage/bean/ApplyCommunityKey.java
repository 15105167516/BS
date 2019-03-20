package com.suke.communitymanage.bean;

public class ApplyCommunityKey {
    private String temUserId;

    private Integer temComId;

    public ApplyCommunityKey() {
    }

    public ApplyCommunityKey(String temUserId, Integer temComId) {
        this.temUserId = temUserId;
        this.temComId = temComId;
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

    @Override
    public String toString() {
        return "ApplyCommunityKey{" +
                "temUserId='" + temUserId + '\'' +
                ", temComId=" + temComId +
                '}';
    }
}