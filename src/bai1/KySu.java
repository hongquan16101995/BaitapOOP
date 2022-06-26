package bai1;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String name, String address, String gender, int age, String nganhDaoTao) {
        super(name, address, gender, age);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
