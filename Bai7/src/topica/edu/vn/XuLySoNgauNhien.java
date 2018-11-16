package topica.edu.vn;

import java.util.Random;

public class XuLySoNgauNhien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []M = new int[10];
		Random rd =new Random();
		for (int i = 0; i < M.length; i++) {
			M[i] =rd.nextInt(100);
		}
		System.out.println("Mảng ngẫu nhiên là :");
		for (int i = 0; i < M.length; i++) {
			System.out.println(M[i] +"\t");
		}
		

	}

}
