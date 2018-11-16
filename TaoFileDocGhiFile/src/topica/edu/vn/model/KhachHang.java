package topica.edu.vn.model;

import java.io.Serializable;

public class KhachHang implements Serializable {
	private String ma;
	private String ten;
	
	
	public KhachHang(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
	public KhachHang() {
		super();
	}
	
	//geter seter
	
	@Override
	public String toString() {
		return this.ten +"\t" +this.ma;
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
	

}
