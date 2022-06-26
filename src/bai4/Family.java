package bai4;

import java.util.ArrayList;

public class Family {
    private ArrayList<Person> persons;
    private String address;

    public Family() {
    }

    public Family(ArrayList<Person> persons, String address) {
        this.persons = persons;
        this.address = address;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family{" +
                "persons=" + persons +
                ", address='" + address + '\'' +
                '}';
    }
}
