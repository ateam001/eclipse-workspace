package topica.edu.vn;

public class TestNhanVIen {

	public static void main(String[] args) {
		NhanVien teo =new NhanVienChinthuc();
		teo.setTen("Nguyen vAn Teo");
		System.out.println(teo);
		
		teo = new NhanVienThoiVu();
		teo.setTen("Nguyen Van Teo");
		System.out.println(teo);

	}

}
