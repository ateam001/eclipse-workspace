package topica.edu.vn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import topica.edu.vn.model.KhachHang;

public class SeriallizableFileFactory {
	public static boolean luuFile(ArrayList<KhachHang>dsKH,String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			oos.writeObject(dsKH);
			fos.close();
			oos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	public static ArrayList<KhachHang>docFIle(String path) {
		ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dsKH = (ArrayList<KhachHang>) data;
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsKH;
		
	}
	
	
	

}
