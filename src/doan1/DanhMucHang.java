/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class DanhMucHang {
    private ArrayList<SanPham> danhSachHang = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void nhapDanhSach() {
        System.out.println("Nhap so luong san pham: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai san pham: ");
            System.out.println("1. Hang kho");
            System.out.println("2. Hang nuoc");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ma san pham: ");
            String maSP = scanner.nextLine();
            System.out.print("Ten san pham: ");
            String tenSP = scanner.nextLine();
            System.out.print("So luong: ");
            int soLuong = scanner.nextInt();
            System.out.print("Don gia: ");
            double donGia = scanner.nextDouble();

            if (choice == 1) {
                System.out.print("Khoi luong: ");
                double khoiLuong = scanner.nextDouble();
                HangKho hangKho = new HangKho(maSP, tenSP, soLuong, donGia, khoiLuong);
                danhSachHang.add(hangKho);
            } else if (choice == 2) {
                System.out.print("The tich: ");
                double theTich = scanner.nextDouble();
                HangNuoc hangNuoc = new HangNuoc(maSP, tenSP, soLuong, donGia, theTich);
                danhSachHang.add(hangNuoc);
            }
        }
    }

    public void xuatDanhSach() {
        System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s\n", "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành Tiền", "Khối Lượng/Thể Tích");
        for (SanPham sp : danhSachHang) {
            sp.xuat();
        }
    }

    public void sapXep() {
        danhSachHang.sort((sp1, sp2) -> sp1.getMaSP().compareTo(sp2.getMaSP()));
    }


    public SanPham timKiem(String maSP) {
        for (SanPham sp : danhSachHang) {
            if (sp.getMaSP().equals(maSP)) {
                return sp;
            }
        }
        return null;
    }

    public void themSanPham(SanPham sp) {
        danhSachHang.add(sp);
    }

    public void xoaSanPham(String maSP) {
        danhSachHang.removeIf(sp -> sp.getMaSP().equals(maSP));
    }

    public void suaSanPham(String maSP) {
        SanPham sp = timKiem(maSP);
        if (sp != null) {
            System.out.print("Nhap ten moi: ");
            sp.setTenSP(scanner.nextLine());
            System.out.print("Nhap so luong moi: ");
            sp.setSoLuong(scanner.nextInt());
            System.out.print("Nhap don gia moi: ");
            sp.setDonGia(scanner.nextDouble());
            sp.setThanhTien(sp.getSoLuong() * sp.getDonGia());
        } else {
            System.out.println("Khong tim thay san pham.");
        }
    }

}
