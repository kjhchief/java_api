package ezen.api;

import java.util.Random;

public class MathExample {

	public static void main(String[] args) {
//		Math math = new Math(); 클래스로 바로 쓰는거라 인스턴스 객체 못 만듦.
		System.out.println(Math.E);
		
		double average = 81.445;
		System.out.println(Math.round(average));
		System.out.println(Math.ceil(average));
		System.out.println(Math.floor(average));
		
		 int no = (int)(Math.random() * 45) + 1;
		 System.out.println(no);
		 
		 Random random = new Random();
		 System.out.println(random.nextBoolean());
		 System.out.println(random.nextFloat());
		 System.out.println(random.nextInt()); // -21억 ~~ 21억 사이의 임의값.
		 int num = random.nextInt(45)+1; // 0~44
		 System.out.println(num);

	}

}
