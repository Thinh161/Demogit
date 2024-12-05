/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan1;

/**
 *
 * @author My Pc
 */
public class HangNuoc extends SanPham{
    private double theTich;

    public HangNuoc(String maSP, String tenSP, int soLuong, double donGia, double theTich) {
        super(maSP, tenSP, soLuong, donGia);
        this.theTich = theTich;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" %-10.2f\n", theTich);
    }

    public double getTheTich() {
        return theTich;
    }

    public void setTheTich(double theTich) {
        this.theTich = theTich;
    }
}