package ABCBank;

import java.util.Scanner;

public class TaiKhoan {
    long soTaiKhoan;
    String tenTaiKhoan;
    double soTienTrongTaiKhoan ;
    public double LAISUAT = 0.035;

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }

    public TaiKhoan() {
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }
    public void NapTienVao(double soTienNapVao) {
        if (soTienNapVao > 0){
            this.soTienTrongTaiKhoan += soTienNapVao;
        }else{
            System.out.println("Số tiền nạp không hợp lệ! ");
        }
        System.out.println("Số tiền sau khi nạp: " + this.soTienTrongTaiKhoan);
    }
    public void RutTienRa (double soTienRutRa, double phiRutTien) {
        if (soTienRutRa > 0 && soTienRutRa + phiRutTien <= soTienTrongTaiKhoan) {
            soTienTrongTaiKhoan -= (soTienRutRa + phiRutTien);
        }else{
            System.out.println("Số tiền rút ra là không hợp lệ! ");
        }
        System.out.println("Số tiền sau khi rút: " + soTienTrongTaiKhoan);
    }
    public void DaoHan (){
        soTienTrongTaiKhoan = (soTienTrongTaiKhoan + soTienTrongTaiKhoan) * LAISUAT;
        System.out.println("Số tiền sau khi đáo hạn là: " + soTienTrongTaiKhoan);
    }
    public void ChuyenKhoan (TaiKhoan taiKhoanDuocChuyen, double soTienCanChuyenKhoan){
        if (soTienCanChuyenKhoan > 0 && soTienTrongTaiKhoan >= soTienCanChuyenKhoan) {
            taiKhoanDuocChuyen.soTienTrongTaiKhoan += soTienCanChuyenKhoan;
        }
        System.out.println("Số tiền đã chuyển khoản cho tài khoản thứ 2 là: " + soTienCanChuyenKhoan + " Và số tiện hiện tại trong tài khoản thứ 2 là: " + taiKhoanDuocChuyen.soTienTrongTaiKhoan);
    }
}
