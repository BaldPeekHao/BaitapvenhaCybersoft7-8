package PhuongTrinhbac2;

import java.util.Scanner;

public class ApplicationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhuongTrinhbac2 phuongTrinhbac2 = new PhuongTrinhbac2();
        System.out.println("Hãy nhập vào số A: ");
        phuongTrinhbac2.setA(scanner.nextInt());
        System.out.println("Hãy nhập vào số B: ");
        phuongTrinhbac2.setB(scanner.nextInt());
        System.out.println("Hãy nhập vào số C: ");
        phuongTrinhbac2.setC(scanner.nextInt());
        double tinhDelta = PhuongTrinhbac2.deltaTinh(phuongTrinhbac2.getA(), phuongTrinhbac2.getB(),phuongTrinhbac2.getC());
        System.out.println("Kết quả sau khi tính Delta là: " + tinhDelta);
        PhuongTrinhbac2.tinhNghiem(phuongTrinhbac2.getA(),phuongTrinhbac2.getB(),phuongTrinhbac2.getC());
    }
}
