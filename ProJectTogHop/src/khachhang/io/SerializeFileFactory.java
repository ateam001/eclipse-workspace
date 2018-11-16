package khachhang.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import khachhang.model.KhachHang;

public class SerializeFileFactory {
	public static boolean luuFile(ArrayList<KhachHang>dsKH,String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dsKH);
			fos.close();
			oos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean docFlie(String path){
		try {
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	

}
