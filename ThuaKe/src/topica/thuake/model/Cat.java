package topica.thuake.model;

public class Cat extends Animal {
	
	private int tall;
	private int legs;
	
	//ham tao
	
	
	public Cat(String name , int size , int weight, int tall, int legs) {
		super(name , size,weight);
		this.tall = tall;
		this.legs = legs;
	}
	
	
	@Override
	public void eat() {
		System.out.println("goi ra phuong thuc an cho meo");
	}









	//set get
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	

}
