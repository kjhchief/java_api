package ezen.api;

public class StringExample {

	public static void main(String[] args) {
		// String은 두 가지의 생성 방법을 제공한다.
		
		// 명시적 생성
		String name = new String("김기정");
		// 묵시적 생성(문자열 리터럴 사용)
		String name2 = "김기정";
		String name3 = "김기정";
		
		// 레퍼런스(주소값) 비교
		System.out.println(name == name2);
		System.out.println(name2 == name3);
		
		// 문자열과 문자열 자체 비교
		System.out.println(name.equals(name3));
		System.out.println(name2.equals(name3));
		
		// 결론: 문자열 생성할 때는 무조건 묵시적 생성을 사용하고, 문자열을 비교할 때는 equals()메소드를 사용
		
		char[]language = {'J', 'A', 'V', 'A'};
		String lang = new String(language);
		System.out.println(lang);
		
		// String의 주요 메소드
		String message = "최강의 언어는 자바입니다";
		String substr = message.substring(4);
		System.out.println(substr);
		System.out.println(message.substring(8, 10));
		String title = message.substring(0, 11) + "...";
		System.out.println(title);
		
		String concatStr = message.concat(" 뻥이야~~~");
		System.out.println(concatStr);
		
		String reply = "asdfasdfasdfaesfasdf 바보 alkdnflansdfl;";
		String reply2 = reply.replaceAll("바보", "천재");
		System.out.println(reply2);
		
		String ssn = "680313-1234567";
		int index = ssn.indexOf('-');
		char c = ssn.charAt(index+1);
		System.out.println(c);
		
		String subject ="          헐랭      ~      ";
		System.out.println(subject.trim());
		
		int number = 34343433;
		// int -> String 으로 형변환.
		String numberStr = String.valueOf(number);
		numberStr.length();
		
		boolean flag = false;
		System.out.println(String.valueOf(flag)); // 문자열 false가 됨.
		
	}

}
