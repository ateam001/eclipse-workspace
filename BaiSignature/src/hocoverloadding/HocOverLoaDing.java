package hocoverloadding;

public class HocOverLoaDing {
	public static int fn(int x, int y) {

		return x + y;
	}
	public static double fn(double x ,double y) {
		
		return x+y;
	}
	
	public static int fn3(int ...arr) {
		int sum =0;
		for (int x: arr) {
			sum +=x;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		System.out.println(fn3(1,2,20));
		
		//ParamaterList
		 
	}
}
