package bai2;

public class TaiLieu {
    private int maTL;
    private String nhaXuatban;
    private long soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(int maTL, String nhaXuatban, long soBanPhatHanh) {
        this.maTL = maTL;
        nhaXuatban = nhaXuatban;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getNhaXuatban() {
        return nhaXuatban;
    }

    public void setNhaXuatban(String nhaXuatban) {
        nhaXuatban = nhaXuatban;
    }

    public long getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoPhatHanh(long soPhatHanh) {
        this.soBanPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return
                "maTL=" + maTL +
                        ", NhaXuatban='" + nhaXuatban + '\'' +
                        ", soBanPhatHanh=" + soBanPhatHanh + " "
                ;
    }
}
