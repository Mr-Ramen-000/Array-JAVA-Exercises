//Exercise 20: Array Sorting with Custom Comparator
//Write a Java program that sorts an array of custom objects
//(e.g., objects with a name and age) using a custom comparator.

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Problem20 {
    public static void main(String[] args) {
        Student[] studentsArr = {
                new Student("Spongebob", 12),
                new Student("Mr Krabs", 21),
                new Student("Squidward", 18),
                new Student("Patrick", 14),
        };

        System.out.println("Original Student Array:");
        printArrayObject(studentsArr);

        Arrays.sort(studentsArr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("\nStudent Array Sorted by Name:");
        printArrayObject(studentsArr);


        Arrays.sort(studentsArr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        });
        System.out.println("\nStudent Array Sorted by Age:");
        printArrayObject(studentsArr);

    }

    public static void printArrayObject(Student[] student){
        for (Student s: student) {
            System.out.println("Name: " + s.getName() + "\t Age: " + s.getAge());
        }
    }
}