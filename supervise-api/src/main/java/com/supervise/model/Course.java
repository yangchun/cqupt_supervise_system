package com.supervise.model;

public class Course {
    private Integer id;

    private String grade;

    private String courseNumber;

    private String courseName;

    private String courseProperty;

    private Float credit;

    private Integer theoryPeriod;

    private Integer experimentPeriod;

    private String classes;

    private String timeAddress;

    private String professionName;

    private String teacher;

    private Integer studentNumber;

    private String academy;

    private Integer academyNumber;

    private String courseType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
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

    public String getCourseProperty() {
        return courseProperty;
    }

    public void setCourseProperty(String courseProperty) {
        this.courseProperty = courseProperty == null ? null : courseProperty.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public Integer getTheoryPeriod() {
        return theoryPeriod;
    }

    public void setTheoryPeriod(Integer theoryPeriod) {
        this.theoryPeriod = theoryPeriod;
    }

    public Integer getExperimentPeriod() {
        return experimentPeriod;
    }

    public void setExperimentPeriod(Integer experimentPeriod) {
        this.experimentPeriod = experimentPeriod;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getTimeAddress() {
        return timeAddress;
    }

    public void setTimeAddress(String timeAddress) {
        this.timeAddress = timeAddress == null ? null : timeAddress.trim();
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName == null ? null : professionName.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public Integer getAcademyNumber() {
        return academyNumber;
    }

    public void setAcademyNumber(Integer academyNumber) {
        this.academyNumber = academyNumber;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }
}