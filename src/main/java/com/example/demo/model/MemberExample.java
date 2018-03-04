package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("member_type like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("member_type not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andProfileDirIsNull() {
            addCriterion("profile_dir is null");
            return (Criteria) this;
        }

        public Criteria andProfileDirIsNotNull() {
            addCriterion("profile_dir is not null");
            return (Criteria) this;
        }

        public Criteria andProfileDirEqualTo(String value) {
            addCriterion("profile_dir =", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirNotEqualTo(String value) {
            addCriterion("profile_dir <>", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirGreaterThan(String value) {
            addCriterion("profile_dir >", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirGreaterThanOrEqualTo(String value) {
            addCriterion("profile_dir >=", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirLessThan(String value) {
            addCriterion("profile_dir <", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirLessThanOrEqualTo(String value) {
            addCriterion("profile_dir <=", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirLike(String value) {
            addCriterion("profile_dir like", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirNotLike(String value) {
            addCriterion("profile_dir not like", value, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirIn(List<String> values) {
            addCriterion("profile_dir in", values, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirNotIn(List<String> values) {
            addCriterion("profile_dir not in", values, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirBetween(String value1, String value2) {
            addCriterion("profile_dir between", value1, value2, "profileDir");
            return (Criteria) this;
        }

        public Criteria andProfileDirNotBetween(String value1, String value2) {
            addCriterion("profile_dir not between", value1, value2, "profileDir");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Long value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Long value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Long value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Long value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Long value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Long> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Long> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Long value1, Long value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Long value1, Long value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdIsNull() {
            addCriterion("consultant_id is null");
            return (Criteria) this;
        }

        public Criteria andConsultantIdIsNotNull() {
            addCriterion("consultant_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsultantIdEqualTo(Long value) {
            addCriterion("consultant_id =", value, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdNotEqualTo(Long value) {
            addCriterion("consultant_id <>", value, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdGreaterThan(Long value) {
            addCriterion("consultant_id >", value, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consultant_id >=", value, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdLessThan(Long value) {
            addCriterion("consultant_id <", value, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdLessThanOrEqualTo(Long value) {
            addCriterion("consultant_id <=", value, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdIn(List<Long> values) {
            addCriterion("consultant_id in", values, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdNotIn(List<Long> values) {
            addCriterion("consultant_id not in", values, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdBetween(Long value1, Long value2) {
            addCriterion("consultant_id between", value1, value2, "consultantId");
            return (Criteria) this;
        }

        public Criteria andConsultantIdNotBetween(Long value1, Long value2) {
            addCriterion("consultant_id not between", value1, value2, "consultantId");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseIsNull() {
            addCriterion("period_phase is null");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseIsNotNull() {
            addCriterion("period_phase is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseEqualTo(String value) {
            addCriterion("period_phase =", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseNotEqualTo(String value) {
            addCriterion("period_phase <>", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseGreaterThan(String value) {
            addCriterion("period_phase >", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseGreaterThanOrEqualTo(String value) {
            addCriterion("period_phase >=", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseLessThan(String value) {
            addCriterion("period_phase <", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseLessThanOrEqualTo(String value) {
            addCriterion("period_phase <=", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseLike(String value) {
            addCriterion("period_phase like", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseNotLike(String value) {
            addCriterion("period_phase not like", value, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseIn(List<String> values) {
            addCriterion("period_phase in", values, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseNotIn(List<String> values) {
            addCriterion("period_phase not in", values, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseBetween(String value1, String value2) {
            addCriterion("period_phase between", value1, value2, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseNotBetween(String value1, String value2) {
            addCriterion("period_phase not between", value1, value2, "periodPhase");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterionForJDBCDate("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterionForJDBCDate("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterionForJDBCDate("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeIsNull() {
            addCriterion("birth_time is null");
            return (Criteria) this;
        }

        public Criteria andBirthTimeIsNotNull() {
            addCriterion("birth_time is not null");
            return (Criteria) this;
        }

        public Criteria andBirthTimeEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time =", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time <>", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("birth_time >", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time >=", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeLessThan(Date value) {
            addCriterionForJDBCDate("birth_time <", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time <=", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeIn(List<Date> values) {
            addCriterionForJDBCDate("birth_time in", values, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth_time not in", values, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_time between", value1, value2, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_time not between", value1, value2, "birthTime");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFromWhereIsNull() {
            addCriterion("from_where is null");
            return (Criteria) this;
        }

        public Criteria andFromWhereIsNotNull() {
            addCriterion("from_where is not null");
            return (Criteria) this;
        }

        public Criteria andFromWhereEqualTo(String value) {
            addCriterion("from_where =", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereNotEqualTo(String value) {
            addCriterion("from_where <>", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereGreaterThan(String value) {
            addCriterion("from_where >", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereGreaterThanOrEqualTo(String value) {
            addCriterion("from_where >=", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereLessThan(String value) {
            addCriterion("from_where <", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereLessThanOrEqualTo(String value) {
            addCriterion("from_where <=", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereLike(String value) {
            addCriterion("from_where like", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereNotLike(String value) {
            addCriterion("from_where not like", value, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereIn(List<String> values) {
            addCriterion("from_where in", values, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereNotIn(List<String> values) {
            addCriterion("from_where not in", values, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereBetween(String value1, String value2) {
            addCriterion("from_where between", value1, value2, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andFromWhereNotBetween(String value1, String value2) {
            addCriterion("from_where not between", value1, value2, "fromWhere");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateIsNull() {
            addCriterion("period_phase_date is null");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateIsNotNull() {
            addCriterion("period_phase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("period_phase_date =", value, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("period_phase_date <>", value, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("period_phase_date >", value, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("period_phase_date >=", value, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateLessThan(Date value) {
            addCriterionForJDBCDate("period_phase_date <", value, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("period_phase_date <=", value, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("period_phase_date in", values, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("period_phase_date not in", values, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("period_phase_date between", value1, value2, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andPeriodPhaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("period_phase_date not between", value1, value2, "periodPhaseDate");
            return (Criteria) this;
        }

        public Criteria andIsPostponeIsNull() {
            addCriterion("is_postpone is null");
            return (Criteria) this;
        }

        public Criteria andIsPostponeIsNotNull() {
            addCriterion("is_postpone is not null");
            return (Criteria) this;
        }

        public Criteria andIsPostponeEqualTo(String value) {
            addCriterion("is_postpone =", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeNotEqualTo(String value) {
            addCriterion("is_postpone <>", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeGreaterThan(String value) {
            addCriterion("is_postpone >", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeGreaterThanOrEqualTo(String value) {
            addCriterion("is_postpone >=", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeLessThan(String value) {
            addCriterion("is_postpone <", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeLessThanOrEqualTo(String value) {
            addCriterion("is_postpone <=", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeLike(String value) {
            addCriterion("is_postpone like", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeNotLike(String value) {
            addCriterion("is_postpone not like", value, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeIn(List<String> values) {
            addCriterion("is_postpone in", values, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeNotIn(List<String> values) {
            addCriterion("is_postpone not in", values, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeBetween(String value1, String value2) {
            addCriterion("is_postpone between", value1, value2, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsPostponeNotBetween(String value1, String value2) {
            addCriterion("is_postpone not between", value1, value2, "isPostpone");
            return (Criteria) this;
        }

        public Criteria andIsProblemIsNull() {
            addCriterion("is_problem is null");
            return (Criteria) this;
        }

        public Criteria andIsProblemIsNotNull() {
            addCriterion("is_problem is not null");
            return (Criteria) this;
        }

        public Criteria andIsProblemEqualTo(String value) {
            addCriterion("is_problem =", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemNotEqualTo(String value) {
            addCriterion("is_problem <>", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemGreaterThan(String value) {
            addCriterion("is_problem >", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemGreaterThanOrEqualTo(String value) {
            addCriterion("is_problem >=", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemLessThan(String value) {
            addCriterion("is_problem <", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemLessThanOrEqualTo(String value) {
            addCriterion("is_problem <=", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemLike(String value) {
            addCriterion("is_problem like", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemNotLike(String value) {
            addCriterion("is_problem not like", value, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemIn(List<String> values) {
            addCriterion("is_problem in", values, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemNotIn(List<String> values) {
            addCriterion("is_problem not in", values, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemBetween(String value1, String value2) {
            addCriterion("is_problem between", value1, value2, "isProblem");
            return (Criteria) this;
        }

        public Criteria andIsProblemNotBetween(String value1, String value2) {
            addCriterion("is_problem not between", value1, value2, "isProblem");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysIsNull() {
            addCriterion("postpone_days is null");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysIsNotNull() {
            addCriterion("postpone_days is not null");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysEqualTo(Integer value) {
            addCriterion("postpone_days =", value, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysNotEqualTo(Integer value) {
            addCriterion("postpone_days <>", value, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysGreaterThan(Integer value) {
            addCriterion("postpone_days >", value, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("postpone_days >=", value, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysLessThan(Integer value) {
            addCriterion("postpone_days <", value, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysLessThanOrEqualTo(Integer value) {
            addCriterion("postpone_days <=", value, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysIn(List<Integer> values) {
            addCriterion("postpone_days in", values, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysNotIn(List<Integer> values) {
            addCriterion("postpone_days not in", values, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysBetween(Integer value1, Integer value2) {
            addCriterion("postpone_days between", value1, value2, "postponeDays");
            return (Criteria) this;
        }

        public Criteria andPostponeDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("postpone_days not between", value1, value2, "postponeDays");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}