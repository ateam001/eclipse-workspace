package topica.edu.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import topica.edu.model.KhachHang;

public class TestFileFactory {
	public static boolean luuFile(ArrayList<KhachHang>dsKH,String path) {
		try {
			
			
			FileOutputStream fos =new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter  bw =new BufferedWriter(osw);
			for (KhachHang kh : dsKH) {
				String line =kh.getMa()+":"+kh.getTen();
				bw.write(line);
				bw.close();
				fos.close();
				osw.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return true;
	};

}
