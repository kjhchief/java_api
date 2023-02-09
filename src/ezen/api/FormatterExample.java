package ezen.api;

import java.util.Calendar;
import java.util.Formatter;

/**
 * 프로그램에서 다루는 다양한 데이터(문자열, 정수, 실수, 날짜 등)를
 * 원하는 출력 형식으로 만들기 위해 Java5버젼에 추가된 Formatter 클래스
 * @Author 김재훈
 * @Date 2023. 1. 12.
 */
public class FormatterExample {

	public static void main(String[] args) {
		int money = 34343434;
		System.out.println(money);
		Formatter formatter = new Formatter();
		formatter = formatter.format("%+,15d\n", money);
		formatter = formatter.format("%+,15d", money);
		System.out.println(formatter);
		
		double average = 56.3434343;
		System.out.println(average);
		formatter = formatter.format("%,15.2f\n", average);
		System.out.println(formatter);
		
		String accountNum = "1111-2222-3333";
		formatter = new Formatter();
		formatter = formatter.format("%-30s\n", accountNum);
		System.out.println(formatter);
		
		int x = 1234567;
		formatter = new Formatter();
		formatter = formatter.format("%-30b\n", x);
		System.out.println(formatter);
		
		// 콘솔출력
		System.out.println("");
		System.out.print("");
		System.out.printf("%+,15d\n", money); //real개꿀기능
		
		//String의 static format();
		int y = 12345;
		String formated = String.format("%-,10d", y);
		System.out.println(formated);
		System.out.println();
		System.out.println();
		
		// Calendar 관련 포맷 문자
		Calendar now = Calendar.getInstance();
		System.out.printf("%1$tF %1$tT (%1$tA)", now);
		
		
	}

}
