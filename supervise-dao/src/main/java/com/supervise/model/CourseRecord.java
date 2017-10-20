package com.supervise.model;

import java.util.Date;

public class CourseRecord {
    private Integer id;

    private String courseNumber;

    private String courseName;

    private String courseType;

    private Float courseCredit;

    private String courseProperty;

    private String academy;

    private Integer theoryPeriod;

    private String profession;

    private String teacher;

    private String classroom;

    private String classes;

    private String courseContent;

    private String supervisionTime;

    private String teachingAttitudeScore;

    private String teachingContentScore;

    private String teachingMethodScore;

    private String teachingEffectScore;

    private Float lessonTotalScore;

    private Integer studentShouldNum;

    private Integer studentReallyNum;

    private Integer lateStudentNum;

    private Float realRate;

    private Float lateRate;

    private String studentLessonSituation;

    private String studentStatusScore;

    private Float studentTotalScore;

    private String teachingEnvironmentContent;

    private String teachingEnvironmentScore;

    private String suggestion;

    private String supervisorName;

    private Integer courseLevel;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber == null ? null : courseNumber.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public Float getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Float courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseProperty() {
        return courseProperty;
    }

    public void setCourseProperty(String courseProperty) {
        this.courseProperty = courseProperty == null ? null : courseProperty.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public Integer getTheoryPeriod() {
        return theoryPeriod;
    }

    public void setTheoryPeriod(Integer theoryPeriod) {
        this.theoryPeriod = theoryPeriod;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom == null ? null : classroom.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent == null ? null : courseContent.trim();
    }

    public String getSupervisionTime() {
        return supervisionTime;
    }

    public void setSupervisionTime(String supervisionTime) {
        this.supervisionTime = supervisionTime == null ? null : supervisionTime.trim();
    }

    public String getTeachingAttitudeScore() {
        return teachingAttitudeScore;
    }

    public void setTeachingAttitudeScore(String teachingAttitudeScore) {
        this.teachingAttitudeScore = teachingAttitudeScore == null ? null : teachingAttitudeScore.trim();
    }

    public String getTeachingContentScore() {
        return teachingContentScore;
    }

    public void setTeachingContentScore(String teachingContentScore) {
        this.teachingContentScore = teachingContentScore == null ? null : teachingContentScore.trim();
    }

    public String getTeachingMethodScore() {
        return teachingMethodScore;
    }

    public void setTeachingMethodScore(String teachingMethodScore) {
        this.teachingMethodScore = teachingMethodScore == null ? null : teachingMethodScore.trim();
    }

    public String getTeachingEffectScore() {
        return teachingEffectScore;
    }

    public void setTeachingEffectScore(String teachingEffectScore) {
        this.teachingEffectScore = teachingEffectScore == null ? null : teachingEffectScore.trim();
    }

    public Float getLessonTotalScore() {
        return lessonTotalScore;
    }

    public void setLessonTotalScore(Float lessonTotalScore) {
        this.lessonTotalScore = lessonTotalScore;
    }

    public Integer getStudentShouldNum() {
        return studentShouldNum;
    }

    public void setStudentShouldNum(Integer studentShouldNum) {
        this.studentShouldNum = studentShouldNum;
    }

    public Integer getStudentReallyNum() {
        return studentReallyNum;
    }

    public void setStudentReallyNum(Integer studentReallyNum) {
        this.studentReallyNum = studentReallyNum;
    }

    public Integer getLateStudentNum() {
        return lateStudentNum;
    }

    public void setLateStudentNum(Integer lateStudentNum) {
        this.lateStudentNum = lateStudentNum;
    }

    public Float getRealRate() {
        return realRate;
    }

    public void setRealRate(Float realRate) {
        this.realRate = realRate;
    }

    public Float getLateRate() {
        return lateRate;
    }

    public void setLateRate(Float lateRate) {
        this.lateRate = lateRate;
    }

    public String getStudentLessonSituation() {
        return studentLessonSituation;
    }

    public void setStudentLessonSituation(String studentLessonSituation) {
        this.studentLessonSituation = studentLessonSituation == null ? null : studentLessonSituation.trim();
    }

    public String getStudentStatusScore() {
        return studentStatusScore;
    }

    public void setStudentStatusScore(String studentStatusScore) {
        this.studentStatusScore = studentStatusScore == null ? null : studentStatusScore.trim();
    }

    public Float getStudentTotalScore() {
        return studentTotalScore;
    }

    public void setStudentTotalScore(Float studentTotalScore) {
        this.studentTotalScore = studentTotalScore;
    }

    public String getTeachingEnvironmentContent() {
        return teachingEnvironmentContent;
    }

    public void setTeachingEnvironmentContent(String teachingEnvironmentContent) {
        this.teachingEnvironmentContent = teachingEnvironmentContent == null ? null : teachingEnvironmentContent.trim();
    }

    public String getTeachingEnvironmentScore() {
        return teachingEnvironmentScore;
    }

    public void setTeachingEnvironmentScore(String teachingEnvironmentScore) {
        this.teachingEnvironmentScore = teachingEnvironmentScore == null ? null : teachingEnvironmentScore.trim();
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName == null ? null : supervisorName.trim();
    }

    public Integer getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(Integer courseLevel) {
        this.courseLevel = courseLevel;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}