package PhuongTrinhbac2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PhuongTrinhbac2 {
    double a;
    double b;
    double c;

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public PhuongTrinhbac2() {

    }

    public PhuongTrinhbac2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public static double deltaTinh(double soA, double soB, double soC) {
        return Math.pow(soB, 2) - 4 * soA * soC;
    }

    public static void tinhNghiem(double soA, double soB, double soC) {
        if (deltaTinh(soA, soB, soC) > 0) {
            double nghiem1 = (-soB + Math.sqrt(deltaTinh(soA, soB, soC)) / (2 * soA));
            double nghiem2 = (-soB - Math.sqrt(deltaTinh(soA, soB, soC)) / (2 * soA));
            System.out.println("Phương trình có hai nghiệm phân biệt: ");
            System.out.println("Nghiệm 1: " + nghiem1);
            System.out.println("Nghiệm 2: " + nghiem2);
        } else if (deltaTinh(soA, soB, soC) == 0) {
            double nghiem = -soB / (2 * soA);
            System.out.println("Phương trình có một nghiệm kép: ");
            System.out.println("Nghiệm: " + nghiem);
        } else {
            System.out.println("Phương trình vô nghiệm. ");
        }
    }
}
