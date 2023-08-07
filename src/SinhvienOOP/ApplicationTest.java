package SinhvienOOP;

import PhuongTrinhbac2.PhuongTrinhbac2;
import java.util.Scanner;
public class ApplicationTest {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(3979259, "Trương Tường Hạo", 9.3, 9.8);
        SinhVien sinhVien2 = new SinhVien(3967944, "Trương Thái Tuyên", 9.2, 9.1);
        SinhVien sinhVien3 = new SinhVien();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập mã sinh viên: ");
        sinhVien3.setMaSinhVien(scanner.nextInt());
        System.out.println("Hãy nhập họ tên sinh viên: ");
        sinhVien3.setHoTen(scanner.nextLine());
        sinhVien3.setHoTen(scanner.nextLine());
        System.out.println("Hãy nhập điểm Lý thuyết: ");
        sinhVien3.setDiemLT(scanner.nextFloat());
        System.out.println("Hãy nhập điểm Thực hành: ");
        sinhVien3.setDiemTH(scanner.nextFloat());
        SinhVien.diemTrungBinh(sinhVien3.getDiemLT(),sinhVien3.getDiemTH());
        System.out.println(sinhVien1);
        System.out.println(sinhVien2);
        System.out.println(sinhVien3);
    }
}
//