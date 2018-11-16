package topica.edu.vn;

import java.util.ArrayList;
import java.util.Collections;

public class TestNhanVien {

	public static void main(String[] args) {
		ArrayList<NhanVien>ds = new ArrayList<NhanVien>();
		ds.add( new NhanVien(1,"teo"));
		ds.add(new NhanVien(2,"an"));
		ds.add(new NhanVien(3,"toan"));
		ds.add(new NhanVien(4,"linh"));
		ds.add(new NhanVien(5,"tuan"));
		
		System.out.println("danh sahc nhan vien cong ty la");
		for (NhanVien nv : ds) {
			System.out.println(nv.getTen());
		}
		
		Collections.sort(ds);
	}

}
