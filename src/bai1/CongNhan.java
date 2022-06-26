package bai1;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(String name, String address, String gender, int age, int bac) {
        super(name, address, gender, age);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
