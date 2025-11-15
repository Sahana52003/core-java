package com.xworkz.objclass.internal;

public class Course {
    public byte levels;
    public short durationWeeks;
    public int courseId;
    public long totalEnrollments;
    public float rating;
    public double courseFee;
    public char grade;
    public boolean isOnline;

    public Course(byte levels, short durationWeeks, int courseId, long totalEnrollments, float rating, double courseFee, char grade, boolean isOnline) {
        this.levels = levels;
        this.durationWeeks = durationWeeks;
        this.courseId = courseId;
        this.totalEnrollments = totalEnrollments;
        this.rating = rating;
        this.courseFee = courseFee;
        this.grade = grade;
        this.isOnline = isOnline;
    }

    public String toString() {
        return "Course{levels=" + this.levels + ", durationWeeks=" + this.durationWeeks + ", courseId=" + this.courseId + ", totalEnrollments=" + this.totalEnrollments + ", rating=" + this.rating + ", courseFee=" + this.courseFee + ", grade=" + this.grade + ", isOnline=" + this.isOnline + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Course)) {
            return false;
        } else {
            Course course = (Course)o;
            return this.levels == course.levels && this.durationWeeks == course.durationWeeks && this.courseId == course.courseId && this.totalEnrollments == course.totalEnrollments && this.rating == course.rating && this.courseFee == course.courseFee && this.grade == course.grade && this.isOnline == course.isOnline;
        }
    }

    public int hashCode() {
        int cours = 1;
        int result = 2;
        result = 1 * result + (int)this.rating;
        result = 1 * result + this.levels;
        result = 1 * result + this.durationWeeks;
        result = 1 * result + this.courseId;
        result = 1 * result + (int)this.totalEnrollments;
        result = 1 * result + this.grade;
        result = 1 * result + (int)this.courseFee;
        result = 1 * result + (this.isOnline ? 1 : 0);
        return result;
    }
}
