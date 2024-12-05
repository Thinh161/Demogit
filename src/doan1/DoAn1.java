/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doan1;

import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class DoAn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic class DoAn {

        DanhMucHang danhMuc = new DanhMucHang();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChon chuc nang:");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Xuat danh sach san pham");
            System.out.println("3. Sap xep san pham");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Them san pham");
            System.out.println("6. Xoa san pham");
            System.out.println("7. Sua san pham");
            System.out.println("8. Thoat");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    danhMuc.nhapDanhSach();
                    break;
                case 2:
                    danhMuc.xuatDanhSach();
                    break;
                case 3:
                    danhMuc.sapXep();
                    System.out.println("Danh sach da duoc sap xep.");
                    break;
                case 4:
                    System.out.print("Nhap ma san pham can tim: ");
                    String maSP = scanner.nextLine();
                    SanPham sp = danhMuc.timKiem(maSP);
                    if (sp != null) {
                        sp.xuat();
                    } else {
                        System.out.println("San pham khong ton tai.");
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma san pham moi: ");
                    String maSPNew = scanner.nextLine();
                    System.out.print("Nhap ten san pham moi: ");
                    String tenSPNew = scanner.nextLine();
                    System.out.print("Nhap so luong: ");
                    int soLuongNew = scanner.nextInt();
                    System.out.print("Nhap don gia: ");
                    double donGiaNew = scanner.nextDouble();
                    HangKho hangKho = new HangKho(maSPNew, tenSPNew, soLuongNew, donGiaNew, 5.0);
                    danhMuc.themSanPham(hangKho);
                    break;
                case 6:
                    System.out.print("Nhap san pham can xoa: ");
                    String maSPXoa = scanner.nextLine();
                    danhMuc.xoaSanPham(maSPXoa);
                    break;
                case 7:
                    System.out.print("Nhap san pham can sua: ");
                    String maSPSua = scanner.nextLine();
                    danhMuc.suaSanPham(maSPSua);
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    return;
            }
        }
    }
}

  


