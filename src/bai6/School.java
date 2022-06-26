package bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    private Student createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên học sinh:");
        String name = sc.next();
        System.out.println("Nhập tuổi học sinh");
        int age = sc.nextInt();
        System.out.println("Nhập quê của học sinh");
        String address = sc.next();
        System.out.println("Nhập lớp của học sinh");
        int classes = sc.nextInt();
        return new Student(name, age, address, classes);
    }

    public void addStudent() {
        Student student = createStudent();
        students.add(student);
    }

    public void student20YearOld() {
        boolean check = false;
        for (Student student : students) {
            if (student.getAge() == 20) {
                check = true;
                System.out.println(student);
            }
        }
        if (!check) {
            System.out.println("Ko có học sinh nào 20 tuổi");
        }
    }

    public void student23YearAndLiveInDN() {
        int count = getCount();
        System.out.println("Số học sinh 23 tuổi quê DN là:" + count);
    }

    private int getCount() {
        int count = 0;
        for (Student student : students) {
            if (student.getAge() == 23 && student.getAddress().equalsIgnoreCase("DN")){
                System.out.println(student);
            count++;}
        }
        return count;
    }
}
