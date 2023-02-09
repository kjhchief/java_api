package ezen.api;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalendarExample {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Calendar 클래스는 추상클래스이므로 생성할 수 없다.
//		Calendar today = new Calendar();
//		Calendar today = new GregorianCalendar();
//		Calendar today2 = new GregorianCalendar();
//		Calendar today3 = new GregorianCalendar();

		// Calendar 클래스는 싱글톤 디자인 패턴이 적용된 대표적인 클래스이다.
		Calendar today = Calendar.getInstance();
		Calendar today1 = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today == today1);

		// get(상수)를 이용하여 Calendar의 필요한 날짜, 시간정보를 얻는다.
		int year = today.get(Calendar.YEAR);
		System.out.println(year);
		int month = today.get(Calendar.MONTH) + 1;
		System.out.println(month);
		int date = today.get(Calendar.DATE);
		System.out.println(date);

		System.out.println("----HOD----");
		int hourOfDay = today.get(Calendar.HOUR_OF_DAY);
		System.out.println(hourOfDay);

		int am_pm = today.get(Calendar.AM_PM);
		System.out.println(am_pm);
		if (am_pm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}

		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		switch (dayOfWeek) {
		case Calendar.MONDAY:

			break;

		default:
			break;
		}

		today.set(1987, 2, 1); // 1987.3.1
		System.out.println(today);
		String ymd = today.get(Calendar.YEAR) + "." + (today.get(Calendar.MONTH) + 1) + "." + today.get(Calendar.DATE);
		System.out.println(ymd);

		Date datee = today.getTime();
		System.out.println(datee.toLocaleString());

		// 1970.1.1 0시0분0초 ~ 1987.3.1 까지의 밀리세컨드
		long mt = today.getTimeInMillis();
		System.out.println(mt / (1000 * 60 * 60 * 24));

		// 미션: 근무일수 계산

		String hireDate = null;
		String finalDate = null;
//		long workDays= getWorkDay(hireDate, finalDate);
		System.out.println("근무일수수수: " + getWorkDay(hireDate, finalDate));

		

	}

	// 근무 일수
	public static long getWorkDay(String hireDate, String finalDate) {
		Calendar day1 = Calendar.getInstance();
		Calendar day2 = Calendar.getInstance();

		System.out.print("입사일: ");
		hireDate = scanner.nextLine();

		StringTokenizer st = new StringTokenizer(hireDate, ".");

		// hireDate에 입력하면 순서대로 yyyy랑 mm여기에 들어가서 da1.set에 들어가야함.
		String y = st.nextToken();
		String m = st.nextToken();
		String d = st.nextToken();

		int yy = Integer.parseInt(y);
		int mm = Integer.parseInt(m);
		int dd = Integer.parseInt(d);

		System.out.print("퇴사일: ");
		finalDate = scanner.nextLine();

		StringTokenizer st2 = new StringTokenizer(finalDate, ".");
		String y2 = st2.nextToken();
		String m2 = st2.nextToken();
		String d2 = st2.nextToken();
		
		int yy2 = Integer.parseInt(y2);
		int mm2 = Integer.parseInt(m2);
		int dd2 = Integer.parseInt(d2);

		day1.set(yy, mm, dd);
		day2.set(yy2, mm2, dd2);
		long diffSec = (day2.getTimeInMillis() - day1.getTimeInMillis()) / (1000 * 60 * 60 * 24);
//		System.out.println("총 근무일수: " + diffSec);
		
		return diffSec;
	}

}
