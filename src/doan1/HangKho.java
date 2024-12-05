/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan1;

/**
 *
 * @author My Pc
 */
public class HangKho extends SanPham{
    private double khoiLuong;

    public HangKho(String maSP, String tenSP, int soLuong, double donGia, double khoiLuong) {
        super(maSP, tenSP, soLuong, donGia); 
        this.khoiLuong = khoiLuong;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" %-10.2f\n", khoiLuong); 
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

}
