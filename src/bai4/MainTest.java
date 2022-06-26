package bai4;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bai4.TownManager townManager = new bai4.TownManager();
        bai4.Town town = townManager.createTown(scanner);
        System.out.println(town);
    }
}
