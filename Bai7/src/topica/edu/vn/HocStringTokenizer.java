package topica.edu.vn;

import java.util.StringTokenizer;

public class HocStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hoc,hoc,hoc nua , .. ...hoc mai";
		StringTokenizer  token= new StringTokenizer(s);
		while(token.hasMoreTokens())
			System.out.println(token.nextToken());
		
		StringTokenizer token2 =new StringTokenizer(s, ",");
		
		while(token.hasMoreTokens())
			
			System.out.println(token2.nextToken());
		

	}

}
