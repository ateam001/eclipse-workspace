package topica.edu.vn.test;

import java.util.ArrayList;


import topica.edu.vn.io.TestFileFactory;
import topica.edu.vn.model.KhachHang;

public class TestKhachHang {
	public static void testLuuFile() {
		ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01","Nguyen thi an"));
		dsKH.add(new KhachHang("KH02","Nguyen Hoang ANh"));
		
		boolean kt =TestFileFactory.luuFile(dsKH, "D:\\dulieu.txt");
		if (kt==true) {
			System.out.println("luu file thanh cong");
		}
		else {
			System.out.println("luu file that bai");
		}
	}

	public static void main(String[] args) {
		testLuuFile();
		ArrayList<KhachHang>dsKH =TestFileFactory.docFile("D:\\dulieu.txt");
		System.out.println("danh sach khach hang nap vao may tinh la :");
		System.out.println("Ma\tTen");
		for (KhachHang khachHang : dsKH) {
			System.out.println(khachHang);
		}
		
	}

}
