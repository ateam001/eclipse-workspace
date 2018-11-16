package khachhang.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import topica.edu.vn.model.KhachHang;

public class TestFileFactory {
	public static boolean luuFile(ArrayList<KhachHang>dsKH,String path) {
		try {
			
			FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			
			for (KhachHang kh : dsKH) {
				String line = kh.getMa() + ";"+ kh.getTen();
				pw.println(line);
			}
			fw.close();
			pw.close();
			return true; 
		} catch (Exception e) {
			e.printStackTrace();
		}
			return false;
	}
	public static ArrayList<KhachHang>docFile(String path) {
		
		ArrayList<KhachHang>dsKh = new ArrayList<KhachHang>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis); 
			BufferedReader br = new BufferedReader(isr);
			String line =br.readLine();
			while (line!=null) {
				String []arr = line.split(";");
				if (arr.length==2) {
					KhachHang kh = new KhachHang(arr[0],arr[1]);
					dsKh.add(kh);
				}
				line =br.readLine();
			}
			fis.close();
			isr.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dsKh;
		
	}

}
