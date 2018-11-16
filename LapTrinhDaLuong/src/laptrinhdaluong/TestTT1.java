package laptrinhdaluong;

public class TestTT1 {

	public static void main(String[] args) {
		LapTrinhDaLuongTuTheard th1 =new LapTrinhDaLuongTuTheard();
		th1.setName("Tien trinh 1");
		th1.start(); //Kich hoat tien trinh goi la tieu trinh
		
		LapTrinhDaLuongTuTheard th2 =new LapTrinhDaLuongTuTheard();
		th2.setName("Tien trinh 2");
		th2.start();
		
	}

}
