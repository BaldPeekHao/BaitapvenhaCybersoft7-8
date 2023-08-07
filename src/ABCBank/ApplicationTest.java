package ABCBank;

public class ApplicationTest {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan(123, "Hạo", 50);
        System.out.println(taiKhoan);
        taiKhoan.NapTienVao(100);
        taiKhoan.RutTienRa(20, 5);
        taiKhoan.DaoHan();
        TaiKhoan taiKhoan2 = new TaiKhoan(12345, "Hải", 0);
        taiKhoan.ChuyenKhoan(taiKhoan2, 300);
    }
}
