package bai6;

public class Student {
    private String name;
    private int age;
    private String address;
    private int classes;

    public Student() {
    }

    public Student(String name, int age, String address, int classes) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", classes=" + classes +
                '}';
    }
}
