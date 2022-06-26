package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiSach {
    private List<TaiLieu> taiLieuList;

    public QuanLiSach() {
        taiLieuList = new ArrayList<>();
    }

    public void themTaiLieu(Scanner scanner) {
        System.out.println("Nhap thong tin tai lieu moi:");
        System.out.print("Nhap ma tai lieu:");
        int ma = scanner.nextInt();
        if (!checkMa(ma)) {
            System.out.print("Nhap nha xuat ban: ");
            String nxb = scanner.next();
            System.out.print("Nhap so ban phat hanh:");
            long sbph = scanner.nextLong();

            System.out.println("Chon loai tai lieu: ");
            System.out.println("1. Sach");
            System.out.println("2. Tap chi");
            System.out.println("3. Bao");
            int chon = scanner.nextInt();
            if (chon == 1) {
                System.out.print("Nhap ten tac gia: ");
                String tacGia = scanner.next();
                System.out.print("Nhap so trang:");
                long soTrang = scanner.nextLong();

                TaiLieu sach = new Sach(ma, nxb, sbph, tacGia, soTrang);
                taiLieuList.add(sach);
            }
            if (chon == 2) {
                System.out.print("Nhap so phat hanh: ");
                Long sph = scanner.nextLong();
                System.out.print("Nhap thang phat hanh: ");
                int tph = scanner.nextInt();

                TaiLieu tapChi = new TapChi(ma, nxb, sbph, sph, tph);
                taiLieuList.add(tapChi);
            }
            if (chon == 3) {
                System.out.print("Nhap ngay phat hanh: ");
                String nph = scanner.next();

                TaiLieu bao = new Bao(ma, nxb, sbph, nph);
                taiLieuList.add(bao);
            }
        } else {
            System.out.println("Ko the them vao");
        }
    }

    public void xoaTaiLieu(Scanner scanner) {
        System.out.println("Nhap ma tai lueu muon xoa: ");
        int ma = scanner.nextInt();
        for (TaiLieu tailieu : taiLieuList) {
            if (tailieu.getMaTL() == ma) {
                taiLieuList.remove(tailieu);
            }
        }
    }

    public void hienThi() {
        for (TaiLieu taiLieu : taiLieuList) {
            System.out.println(taiLieu);
        }
    }

    public void timTaiLieuTheoLoai(Scanner scanner) {
        System.out.print("Chon loai tai lieu: ");
        System.out.println("1. Sach");
        System.out.println("2. Tap chi");
        System.out.println("3. Bao");
        int chon = scanner.nextInt();
        switch (chon) {
            case 1:
                for (TaiLieu taiLieu : taiLieuList) {
                    if (taiLieu instanceof Sach) {
                        System.out.println(taiLieu);
                    }
                }
                break;
            case 2:
                for (TaiLieu taiLieu : taiLieuList) {
                    if (taiLieu instanceof TapChi) {
                        System.out.println(taiLieu);
                    }
                }
                break;
            case 3:
                for (TaiLieu taiLieu : taiLieuList) {
                    if (taiLieu instanceof Bao) {
                        System.out.println(taiLieu);
                    }
                }
                break;
        }
    }

    public boolean checkMa(int ma) {
        for (TaiLieu taiLieu : taiLieuList) {
            if (ma == taiLieu.getMaTL()) {
                return true;
            }
        }
        return false;
    }
}
