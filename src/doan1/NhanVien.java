/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan1;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class NhanVien {
    private String TenNhanVien;
    private String MaNhanVien;

    
    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) throws Exception{
        if(TenNhanVien.length()>20) throw new Exception("Ten qua dai vui long nhap lai");
        this.TenNhanVien = TenNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) throws Exception{
        if(MaNhanVien.length()>3) throw new Exception("Ma qua dai vui long nhap lai");
        this.MaNhanVien = MaNhanVien;
    }

    public NhanVien() {
    }

    public NhanVien(String TenNhanVien, String MaNhanVien) {
        this.TenNhanVien = TenNhanVien;
        this.MaNhanVien = MaNhanVien;
    }

    public void NhapThongTinNV(){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            try{
                System.out.println("Nhap ten nhan vien");
                setTenNhanVien(sc.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Thong bao: " + e.getMessage());
            }
        }
        
        while(true){
            try{
                System.out.println("Nhap ma nhan vien");
                setMaNhanVien(sc.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Thong bao: " + e.getMessage());
            }
        }
    }
    
    public void XuatThongTinNV(){
        System.out.println(MaNhanVien + "\t " + TenNhanVien);
    }
    
    public static void printTilte(){
        System.out.println("Ma \t Ten Nhan Vien");
    }
}

