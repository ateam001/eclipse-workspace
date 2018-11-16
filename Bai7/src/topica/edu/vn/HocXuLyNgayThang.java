package topica.edu.vn;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HocXuLyNgayThang {

	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();
		int nam =cal.get(Calendar.YEAR);
		System.out.println(nam);
		int thang =cal.get(Calendar.MONTH );
		System.out.println(thang +1);
		int ngay =cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(ngay);
		java.util.Date  t= cal.getTime();
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("hom nay" + sdf.format(t));
		SimpleDateFormat sdf4 = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("bay gio la " +sdf4.format(t));
		
	}

}
