package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    private Long memberId;

    private String memberType;

    private String memberName;

    private String gender;

    private Byte age;

    private String profileDir;

    private Long doctorId;

    private Long consultantId;

    private String periodPhase;

    private String status;

    private Date registerTime;

    private Date updateTime;

    private Date birthTime;

    private String occupation;

    private String height;

    private String weight;

    private Long userId;

    private String fromWhere;

    private Date periodPhaseDate;

    private String isPostpone;

    private String isProblem;

    private Integer postponeDays;

    private static final long serialVersionUID = 1L;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getProfileDir() {
        return profileDir;
    }

    public void setProfileDir(String profileDir) {
        this.profileDir = profileDir == null ? null : profileDir.trim();
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public String getPeriodPhase() {
        return periodPhase;
    }

    public void setPeriodPhase(String periodPhase) {
        this.periodPhase = periodPhase == null ? null : periodPhase.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(Date birthTime) {
        this.birthTime = birthTime;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere == null ? null : fromWhere.trim();
    }

    public Date getPeriodPhaseDate() {
        return periodPhaseDate;
    }

    public void setPeriodPhaseDate(Date periodPhaseDate) {
        this.periodPhaseDate = periodPhaseDate;
    }

    public String getIsPostpone() {
        return isPostpone;
    }

    public void setIsPostpone(String isPostpone) {
        this.isPostpone = isPostpone == null ? null : isPostpone.trim();
    }

    public String getIsProblem() {
        return isProblem;
    }

    public void setIsProblem(String isProblem) {
        this.isProblem = isProblem == null ? null : isProblem.trim();
    }

    public Integer getPostponeDays() {
        return postponeDays;
    }

    public void setPostponeDays(Integer postponeDays) {
        this.postponeDays = postponeDays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberId=").append(memberId);
        sb.append(", memberType=").append(memberType);
        sb.append(", memberName=").append(memberName);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", profileDir=").append(profileDir);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", consultantId=").append(consultantId);
        sb.append(", periodPhase=").append(periodPhase);
        sb.append(", status=").append(status);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", birthTime=").append(birthTime);
        sb.append(", occupation=").append(occupation);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", userId=").append(userId);
        sb.append(", fromWhere=").append(fromWhere);
        sb.append(", periodPhaseDate=").append(periodPhaseDate);
        sb.append(", isPostpone=").append(isPostpone);
        sb.append(", isProblem=").append(isProblem);
        sb.append(", postponeDays=").append(postponeDays);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}