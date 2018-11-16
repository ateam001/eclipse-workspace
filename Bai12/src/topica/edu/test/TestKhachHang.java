package topica.edu.test;

import java.util.ArrayList;

import topica.edu.io.TestFileFactory;
import topica.edu.model.KhachHang;

public class TestKhachHang {
	public static void testLuuFile() {
		ArrayList<KhachHang>dsKhachHangs = new ArrayList<KhachHang>();
		dsKhachHangs.add(new KhachHang("KH01","Nguyen Thi Anh"));
		dsKhachHangs.add(new KhachHang("KH02","Nguyen VAn Manh"));
		dsKhachHangs.add(new KhachHang("KH03","Nguyen Thanh Luan"));
		boolean kt = TestFileFactory.luuFile(dsKhachHangs, "f\\dulieu.txt");
		if (kt==true) {
			System.out.println("Da luu file thanh cong");
			
		}
		else {
			System.out.println("Luu file that bai");
		}
		 
	}

}
