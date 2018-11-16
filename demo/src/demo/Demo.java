package demo;

public class Demo {
	public static void main(String[] args) {
		Printer printer =new Printer();
		Print2 print2 =new Print2();
		Thread thread = new Thread(printer);
		thread.start();
		printer.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread" +i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
