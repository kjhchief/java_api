package ezen.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date today = new Date();
		
//		Date ymd = new Date(1987, 3, 2);
//		System.out.println(ymd);
//		String todayString = today.toLocaleString();
//		System.out.println(todayString);
		
		// 내가 원하는 날짜 출력 형식 지정
		// 2023년 2월 13일 수요일
		SimpleDateFormat format = new SimpleDateFormat("G yyyy년 MM월 dd일 HH:mm:ss EEEE");
		String date = format.format(today);
		System.out.println(date);
		
		
	}

}
