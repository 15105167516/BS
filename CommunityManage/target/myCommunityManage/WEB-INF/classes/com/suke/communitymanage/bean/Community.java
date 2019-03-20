package com.suke.communitymanage.bean;

import java.util.List;

public class Community {
    private Integer comId;

    private String comName;

    private String comCreateDate;

    private String comImg;

    private Integer comMemberNumber;

    private String comIntroduction;

    private String comAdminId;
//社团管理员关联
    private Chairman chairman;
    //成员和社团之间的多对多关系；
    private List<Member> members;

    @Override
    public String toString() {
        return "Community{" +
                "comId=" + comId +
                ", comName='" + comName + '\'' +
                ", comCreateDate='" + comCreateDate + '\'' +
                ", comImg='" + comImg + '\'' +
                ", comMemberNumber=" + comMemberNumber +
                ", comIntroduction='" + comIntroduction + '\'' +
                ", comAdminId='" + comAdminId + '\'' +
                ", chairman=" + chairman +
                ", members=" + members +
                '}';
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Chairman getChairman() {
        return chairman;
    }

    public void setChairman(Chairman chairman) {
        this.chairman = chairman;
    }

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

    public String getComAdminId() {
        return comAdminId;
    }

    public void setComAdminId(String comAdminId) {
        this.comAdminId = comAdminId == null ? null : comAdminId.trim();
    }

}