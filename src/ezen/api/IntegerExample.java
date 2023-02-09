package ezen.api;

/**
 * 대표적인 Wrapper클래스
 * @Author 김재훈
 * @Date 2023. 1. 11.
 */
public class IntegerExample {

	public static void main(String[] args) {
		int x = 100;
		Integer integer = new Integer(x);
		double d = integer.doubleValue();
		System.out.println(d);
		
		String num = "1004";
		int value = Integer.parseInt(num);
		value += 100;
		System.out.println(value);
		
		String weight = "56.7";
		double weight2 = Double.parseDouble(weight);
		System.out.println(weight2);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toHexString(x));
		
		for(int i=0; i<100000000; i++) {
//			System.out.print(Integer.toBinaryString(i));
		}
		
	}

}
