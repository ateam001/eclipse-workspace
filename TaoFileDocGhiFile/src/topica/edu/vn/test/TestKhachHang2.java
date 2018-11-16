package topica.edu.vn.test;

import java.util.ArrayList;

import topica.edu.vn.io.SeriallizableFileFactory;
import topica.edu.vn.io.TestFileFactory;
import topica.edu.vn.model.KhachHang;

public class TestKhachHang2 {
	
	public static void testLuuFile() {
		ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01","Nguyen thi an"));
		dsKH.add(new KhachHang("KH02","Nguyen Hoang ANh"));
		
		boolean kt =SeriallizableFileFactory.luuFile(dsKH, "D:\\dulieu2.txt");
		if (kt==true) {
			System.out.println("luu file thanh cong");
		}
		else {
			System.out.println("luu file that bai");
		}
	}

	public static void main(String[] args) {
		testLuuFile();
		ArrayList<KhachHang>dsKH =SeriallizableFileFactory.docFIle("D:\\dulieu2.txt");
		System.out.println("danh sach khach hang nap vao may tinh la :");
		System.out.println("Ma\tTen");
		for (KhachHang khachHang : dsKH) {
			System.out.println(khachHang);
		}
		
	}

}
