package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class TownManager {
    private ArrayList<Person> checkIdPersons;

    public TownManager() {
        checkIdPersons = new ArrayList<>();
    }

    public Town createTown(Scanner scanner) {
        Town town = new Town();
        System.out.println("Nhập vào số hộ dân của thị trấn: ");
        int length = Integer.parseInt(scanner.nextLine());
        ArrayList<Family> families = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            families.add(createFamily(scanner));
        }
        town.setFamilies(families);
        return town;
    }

    public Family createFamily(Scanner scanner) {
        Family family = new Family();
        System.out.println("Nhập vào số thành viên trong gia đình: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ của gia đình: ");
        String address = scanner.nextLine();
        family.setAddress(address);
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            persons.add(createPerson(scanner));
        }
        family.setPersons(persons);
        return family;
    }

    public Person createPerson(Scanner scanner) {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập công việc: ");
        String job = scanner.nextLine();
        String idCard;
        do {
            System.out.println("Nhập idCard: ");
            idCard = scanner.nextLine();
        } while (!checkIdCard(idCard));
        Person person = new Person(name, age, job, idCard);
        checkIdPersons.add(person);
        return person;
    }

    public boolean checkIdCard(String idCard) {
        for (Person person : checkIdPersons) {
            if (person.getIdCard().equals(idCard)) {
                return false;
            }
        }
        return true;
    }
}
