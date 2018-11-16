package topica.edu.vn;

import java.text.DecimalFormat;

public class HocXuLyDinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double toan =5;
		double ly = 6;
		double hoa =9;
		double dtb =(toan +ly +hoa)/3;
		System.out.println("diem trung binh   " +dtb);
		DecimalFormat dcf =new DecimalFormat(" #.# #");
		System.out.println(dcf.format(dtb));

	}

}
