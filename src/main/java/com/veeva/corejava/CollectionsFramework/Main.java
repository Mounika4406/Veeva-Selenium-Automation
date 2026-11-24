
package com.veeva.corejava.CollectionsFramework;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1. ArrayList
        System.out.println("----- ArrayList -----");

        ArrayList<String> names = new ArrayList<>();

        names.add("Mounika");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("Names: " + names);

        names.remove("Rahul");

        System.out.println("After removing Rahul: " + names);


        // 2. LinkedList
        System.out.println("\n----- LinkedList -----");

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.addFirst(5);
        numbers.addLast(40);

        System.out.println("Numbers: " + numbers);


        // 3. HashSet
        System.out.println("\n----- HashSet -----");

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("SQL");
        courses.add("Java");

        System.out.println("Courses: " + courses);


        // 4. HashMap
        System.out.println("\n----- HashMap -----");

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Mounika");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        System.out.println("Students: " + students);

        System.out.println("Student with ID 101: "
                + students.get(101));


        // 5. Iterator
        System.out.println("\n----- Iterator -----");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
