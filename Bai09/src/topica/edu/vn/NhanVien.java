package topica.edu.vn;



public abstract class NhanVien {

	private String ten;
	private String cmnd;
	public abstract int xuatLuong();
	
	
	
	public NhanVien() {
		super();
	}

	public NhanVien(String nhanVien, String cmnd) {
		super();
		this.ten = ten;
		this.cmnd = cmnd;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String nhanVien) {
		this.ten = ten;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	@Override
	public String toString() {
		return this.ten +"===>"+xuatLuong() ;
	}

}
