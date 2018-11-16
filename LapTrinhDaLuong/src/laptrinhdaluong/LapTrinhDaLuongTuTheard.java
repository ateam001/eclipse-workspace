package laptrinhdaluong;

public class LapTrinhDaLuongTuTheard extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() +" i ="+ i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
