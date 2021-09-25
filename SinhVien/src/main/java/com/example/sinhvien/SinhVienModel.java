package com.example.sinhvien;

import java.io.Serializable;
import java.util.Date;

public class SinhVienModel implements Serializable {
    public  String MSSV;
    public String Ten;
    public  String SoDienThoai;
    public Date NgayCap;
    public  Date NgayHetHan;
    public  String MaThe;
    public  String DonVi;
    public String ImagePath;
    public  int Pic;

    public SinhVienModel(String MSSV, String ten, String soDienThoai, Date ngayCap, Date ngayHetHan, String maThe, String donVi, String imagePath, int pic) {
        this.MSSV = MSSV;
        Ten = ten;
        SoDienThoai = soDienThoai;
        NgayCap = ngayCap;
        NgayHetHan = ngayHetHan;
        MaThe = maThe;
        DonVi = donVi;
        ImagePath = imagePath;
        Pic = pic;
    }

    public SinhVienModel() {
    }

    public SinhVienModel(String MSSV, String ten, String soDienThoai, Date ngayCap, Date ngayHetHan, String maThe, String donVi, String imagePath) {
        this.MSSV = MSSV;
        Ten = ten;
        SoDienThoai = soDienThoai;
        NgayCap = ngayCap;
        NgayHetHan = ngayHetHan;
        MaThe = maThe;
        DonVi = donVi;
        ImagePath = imagePath;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public Date getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(Date ngayCap) {
        NgayCap = ngayCap;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        NgayHetHan = ngayHetHan;
    }

    public String getMaThe() {
        return MaThe;
    }

    public void setMaThe(String maThe) {
        MaThe = maThe;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String donVi) {
        DonVi = donVi;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    @Override
    public String toString() {
        return Ten ;
    }
}
