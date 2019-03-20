package com.suke.communitymanage.bean;

public class Community {
    private Integer comId;

    private String comName;

    private String comCreateDate;

    private String comImg;

    private Integer comMemberNumber;

    private String comIntroduction;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public String getComCreateDate() {
        return comCreateDate;
    }

    public void setComCreateDate(String comCreateDate) {
        this.comCreateDate = comCreateDate == null ? null : comCreateDate.trim();
    }

    public String getComImg() {
        return comImg;
    }

    public void setComImg(String comImg) {
        this.comImg = comImg == null ? null : comImg.trim();
    }

    public Integer getComMemberNumber() {
        return comMemberNumber;
    }

    public void setComMemberNumber(Integer comMemberNumber) {
        this.comMemberNumber = comMemberNumber;
    }

    public String getComIntroduction() {
        return comIntroduction;
    }

    public void setComIntroduction(String comIntroduction) {
        this.comIntroduction = comIntroduction == null ? null : comIntroduction.trim();
    }
}