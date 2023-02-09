package ezen.api;

public class DoubleExample {

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		// NaN : Not a Number
		
		System.out.println(x / y);
		double result = x / y;
		check(result);

	}
	
	public static void check(double x) {
		if(Double.isInfinite(x) || Double.isNaN(x)) {
			System.out.println("잘못된 값입니다.");
		}else {
			System.out.println(x * 10);
		}
		
		
	}
	
	

}
