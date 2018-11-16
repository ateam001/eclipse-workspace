package topica.edu.vn;

public class NhanVien implements Comparable<NhanVien> {
	private int ma;
	private String ten;
	
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	
	//0=>banh nhau
	//0>
	public int compareTo(NhanVien o) {
		
//		return this.ten.compareToIgnoreCase(o.getTen());
		if(this.ma == o.ma) 
			return 0;
		if(this.ma>o.ma)
			return 1;
		
		return -1;
	}
	
	
}
