

package com.xworkz.objclass.internal;

public class Student {
    public String name;
    public int age;
    public long id;
    public char grade;
    public double cgpa;

    public Student() {
        System.out.println("Student Details");
    }

    public Student(String name, int age, long id, char grade, double cgpa) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Sora{name of the student " + this.name + " the student age is " + this.age + " has a student id " + this.id + " total grade is " + this.grade + " witha cgpa " + this.cgpa + "}";
    }

    public boolean equals(Object stu) {
        if (this == stu) {
            return true;
        } else if (!(stu instanceof Student)) {
            return false;
        } else {
            Student student = (Student)stu;
            return this.name.equals(student.name) && this.age == student.age && this.id == student.id && this.grade == student.grade && this.cgpa == student.cgpa;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.name.hashCode();
        res = 5 * res + this.age;
        res = 5 * res + (int)this.id;
        res = 5 * res + this.grade;
        res = 5 * res + (int)this.cgpa;
        return res;
    }
}
