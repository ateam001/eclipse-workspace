package topica.edu.model;

public class People2 {
	private String name;
	private String diaChi;
	private String company;
	
	public People2() {
		super();
	}

	public People2(String name, String diaChi, String company) {
		super();
		this.name = name;
		this.diaChi = diaChi;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", diaChi=" + diaChi + ", company=" + company + "]";
	}
	
	
	

}
