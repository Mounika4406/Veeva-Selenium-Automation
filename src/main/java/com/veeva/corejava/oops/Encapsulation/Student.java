
package com.veeva.corejava.oops.encapsulation;

public class Student {

    // Private variables
    private String name;
    private int age;
    private double marks;

    // Setter method for name
    public void setName(String studentName) {
        name = studentName;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for age
    public void setAge(int studentAge) {
        if (studentAge > 0) {
            age = studentAge;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for marks
    public void setMarks(double studentMarks) {
        if (studentMarks >= 0 && studentMarks <= 100) {
            marks = studentMarks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    // Getter method for marks
    public double getMarks() {
        return marks;
    }

    // Main method
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Mounika");
        s1.setAge(22);
        s1.setMarks(85);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
        System.out.println("Student Marks: " + s1.getMarks());
    }
}
