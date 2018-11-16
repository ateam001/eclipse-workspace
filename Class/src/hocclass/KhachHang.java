package hocclass;

public class KhachHang {
	private int ma;
	private String ten;
	private int tuoi;
	private String diaCHi;
	
	
	
	
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
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiaCHi() {
		return diaCHi;
	}
	public void setDiaCHi(String diaCHi) {
		this.diaCHi = diaCHi;
	}
	public KhachHang(int ma, String ten, int tuoi, String diaCHi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaCHi = diaCHi;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		return "KhachHang [ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + ", diaCHi=" + diaCHi + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	
	
	
	
}
