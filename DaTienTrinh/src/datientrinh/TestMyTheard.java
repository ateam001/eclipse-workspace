package datientrinh;

public class TestMyTheard {

	public static void main(String[] args) {

		MyTheard th1 =new MyTheard();
		th1.setName("tien trinh 1");
		th1.start();
		
		MyTheard th2 =new MyTheard();
		th2.setName("tien trinh 2");
		th2.start();
		
	}

}
