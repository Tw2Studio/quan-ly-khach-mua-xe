package com.v2.two.appmanager;

public class KhachHang {
    private String ten;
    private String soDT;
    private String tinh;
    private String hangXe;
    private String soTien;
    private String key;
    private String tinhTrangXe;

    public KhachHang() {
    }

    public KhachHang(String ten, String soDT, String tinh, String hangXe, String soTien, String key, String tinhTrangXe) {
        this.ten = ten;
        this.soDT = soDT;
        this.tinh = tinh;
        this.hangXe = hangXe;
        this.soTien = soTien;
        this.key = key;
        this.tinhTrangXe = tinhTrangXe;
    }

    public KhachHang(String ten, String soDT, String tinh, String hangXe, String soTien) {
        this.ten = ten;
        this.soDT = soDT;
        this.tinh = tinh;
        this.hangXe = hangXe;
        this.soTien = soTien;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTinhTrangXe() {
        return tinhTrangXe;
    }

    public void setTinhTrangXe(String tinhTrangXe) {
        this.tinhTrangXe = tinhTrangXe;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }
}
