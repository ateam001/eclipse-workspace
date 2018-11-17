package topica.thuake.test;

import topica.thuake.model.Animal;
import topica.thuake.model.Cat;

public class testAnimal {

	public static void main(String[] args) {
		
		// Khoi tao animal
		
		Animal animal = new Animal("animal",1,12);
		Cat mommy  = new Cat("mommy", 10, 20, 30, 40);
		mommy.eat();		

	}

}
