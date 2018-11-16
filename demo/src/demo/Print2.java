package demo;

public class Print2 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printer Thead "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
}
