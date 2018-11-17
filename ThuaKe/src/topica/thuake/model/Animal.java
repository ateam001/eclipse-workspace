package topica.thuake.model;

public class Animal {

	private String name;
	private int size;
	private int weight;

	public void eat() {
		System.out.println(" Goi phuong thuc an cuar bo ra");
	}

	public void move() {
		System.out.println(" animal.move() called");
	}

	// tao khong doi
	public Animal() {
		super();
	}

	// Ham tao co doi so day du
	public Animal(String name, int size, int weight) {
		super();
		this.name = name;
		this.size = size;
		this.weight = weight;
	}

	// cac phuong thuc set get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
