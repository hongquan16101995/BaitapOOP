package bai1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm Cán bộ");
            System.out.println("2. Tìm kiếm theo tên Cán bộ");
            System.out.println("3. Hiển thị các Cán bộ");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    qlcb.addCanBo();
                    break;
                case 2:
                    for (CanBo canBo : qlcb.searchCanBo()){
                        System.out.println(canBo);
                    }
                    break;
                case 3:
                    qlcb.displayCanBo();
                    break;
            }
        } while (choice !=0 );
    }
}
