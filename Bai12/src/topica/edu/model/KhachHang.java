 package topica.edu.model;

public class KhachHang {
	private String ma;
	private String ten;
	
	
	public KhachHang() {
		super();
	}


	public KhachHang(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}


	public String getMa() {
		return ma;
	}


	public void setMa(String ma) {
		this.ma = ma;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	@Override
	public String toString() {
		return "KhachHang [ma=" + ma + ", ten=" + ten + "]";
	}
	
	
	
}
