package datientrinh;

public class TestChiaSeVariable {

	public static void main(String[] args) {
		MyTheard2 mt = new MyTheard2();
		Thread th1 = new Thread(mt);
		th1.setName("TT 1 ");
		th1.start();
		Thread th2 = new Thread(mt);
		th2.setName("TT 2 ");
		th2.start();
		Thread th3 = new Thread(mt);
		th3.setName("TT 3");
		th3.start();
		

	}

}
