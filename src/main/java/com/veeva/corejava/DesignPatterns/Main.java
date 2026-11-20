package com.veeva.corejava.designpatterns;
class Student {

    private static final Student obj = new Student();

    private Student() {
    }

    public static Student getInstance() {
        return obj;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();

        System.out.println(s1 == s2);
    }
}