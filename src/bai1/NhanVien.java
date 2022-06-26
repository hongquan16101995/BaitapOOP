package bai1;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        congViec = congViec;
    }

    public NhanVien(String name, String address, String gender, int age, String congViec) {
        super(name, address, gender, age);
        congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "CongViec='" + congViec + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
