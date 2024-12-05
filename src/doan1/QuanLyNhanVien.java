/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author My Pc
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();

    public QuanLyNhanVien () {
        list.add(new NhanVien("Bao", "A11"));
        list.add(new NhanVien("Vy", "A12"));
        list.add(new NhanVien("Tung", "A13"));
        list.add(new NhanVien("Linh", "A14"));
    }

    
    // Ghi danh sách nhân viên vào file
    public void GhiFile(String filename) {
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);

            for (NhanVien nv : list)
                pw.println(nv.getMaNhanVien() + "\t" + nv.getTenNhanVien());
            pw.close();
            fw.close();

            System.out.println("File da ghi thanh cong.");
        } catch (Exception e) {
            System.out.println("Ghi file khong thanh cong: " + e.getMessage());
        }
    }

    // Đọc danh sách nhân viên từ file
    public void DocFile(String filename) {
        try {
            File f = new File(filename);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            list.clear(); // Xóa danh sách cũ để đọc mới
            while ((line = br.readLine()) != null) {
                if (line.trim().equals("")) continue;
                String[] arr = line.split("[\t]+");

                NhanVien nv = new NhanVien(arr[1].trim(), arr[0].trim());
                list.add(nv);
            }
            br.close();
            fr.close();
            System.out.println("Doc file thanh cong.");
        } catch (Exception e) {
            System.out.println("Doc file khong thanh cong: " + e.getMessage());
        }
    }

    // Xuất danh sách nhân viên
    public void XuatDanhSachNV() {
        if (list.isEmpty()) {
            System.out.println("Danh sach nhan vien trong.");
            return;
        }
        System.out.println("\nDanh sach nhan vien");
        NhanVien.printTilte();
        for (NhanVien nv : list)
            nv.XuatThongTinNV();
    }

    // Thêm nhân viên
    public void ThemNhanVien() {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.NhapThongTinNV();
        list.add(nv);
        System.out.println("Da them nhan vien thanh cong.");
        GhiFile("DSNhanVien.txt");
        XuatDanhSachNV();
    }
    
    // Xóa nhân viên dựa trên Mã nhân viên
    public void XoaNhanVienTheoMa() {
        if (list.isEmpty()) {
            System.out.println("Danh sach nhan vien trong, khong the xoa.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String Ma = sc.nextLine();

        boolean found = false;
        Iterator<NhanVien> iterator = list.iterator();
        while (iterator.hasNext()) {
            NhanVien nv = iterator.next();
            if (nv.getMaNhanVien().equalsIgnoreCase(Ma)) {
                System.out.println("Da xoa nhan vien co ma: " + Ma);
                iterator.remove();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay nhan vien co ma: " + Ma);
        } else {
            GhiFile("DSNhanVien.txt");
            XuatDanhSachNV();
        }
    }

    // Tìm nhân viên dựa trên Mã nhân viên
    public void TimNhanVienTheoMa() {
        if (list.isEmpty()) {
            System.out.println("Danh sach nhan vien trong, khong the tim.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String Ma = sc.nextLine();

        boolean found = false;
        for (NhanVien nv : list) {
            if (nv.getMaNhanVien().equalsIgnoreCase(Ma)) {
                System.out.println("Nhan vien tim thay:");
                NhanVien.printTilte();
                nv.XuatThongTinNV();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien co ma: " + Ma);
        }
    }
}


