package vietjack.model;

public class Dog {
	private String name;
	private int age;
	private String diaCHi;
	private float height;
	
	/// ham tao khong doi
	public Dog() {
		super();
	}

	public Dog(String name, int age, String diaCHi, float height) {
		super();
		this.name = name;
		this.age = age;
		this.diaCHi = diaCHi;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDiaCHi() {
		return diaCHi;
	}

	public void setDiaCHi(String diaCHi) {
		this.diaCHi = diaCHi;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", diaCHi=" + diaCHi + ", height=" + height + "]";
	}
	
	
	
	
	
	

}
