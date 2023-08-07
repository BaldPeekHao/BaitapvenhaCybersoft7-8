package SinhvienOOP;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    @Override
    public String toString() {
        return "Đối tượng SinhVien{ | | " +
                "| Mã sinh viên là: " + maSinhVien +
                "| Họ tên là: " + hoTen +
                "| Điểm thực hành: " + diemTH +
                "| Điểm lý thuyết: " + diemLT +
                "| Điểm trung bình: " + SinhVien.diemTrungBinh(getDiemLT(),getDiemTH()) ;
    }

    public SinhVien(){
        this.maSinhVien = 0;
        this.hoTen = " ";
        this.diemLT = 0;
        this.diemTH = 0;
    }
    public SinhVien(int maSinhVien, String hoTen, double diemLT, double diemTH) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public static double diemTrungBinh (double lyThuyet, double thucHanh){
        return (lyThuyet + thucHanh) / 2;
    }
}
