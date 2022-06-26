package bai6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        School school = new School();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm Học Sinh");
            System.out.println("2. Hiển thị các học sinh 20 tuổi");
            System.out.println("3. Hiển thị các học sinh 23 tuổi quê ở DN");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    school.addStudent();
                    break;
                case 2:
                    school.student20YearOld();
                    break;
                case 3:
                    school.student23YearAndLiveInDN();
                    break;
            }
        } while (choice != 0);
    }
}


