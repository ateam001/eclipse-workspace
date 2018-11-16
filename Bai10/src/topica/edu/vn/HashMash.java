package topica.edu.vn;

import java.util.HashMap;

public class HashMash {
	public static void main(String[] args) {
		HashMap<Integer, String> ds =new HashMap<>();
		ds.put(113, "Nguyen van Manh,que YEn bai");
		ds.put(114, "Nguyen Thi Met 1, que YEn Bai");
		ds.put(115, "Nguyen Thi Met 2, que YEn Bai");
		ds.remove(115);
		
//		String nv =ds.get(114);
//		System.out.println(nv);
		System.out.println("danh sach nhan vien cong ty :");
		for (String ten : ds.values()) {
			System.out.println(ten);
		}
	}

}
