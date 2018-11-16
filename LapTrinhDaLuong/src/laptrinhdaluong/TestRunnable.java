package laptrinhdaluong;

public class TestRunnable {

	public static void main(String[] args) {
		Thread th3 = new Thread(new LapTrinhDaTienTrinhRunnable());
		th3.setName("Tien trinh 3");
		th3.start();
		
		Thread th4 = new Thread(new LapTrinhDaTienTrinhRunnable());
		th4.setName("tien trinh 4");
		th4.start();
	}

}
