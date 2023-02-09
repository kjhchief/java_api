package ezen.api;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String cardNumber = "1111-2222-3333-4444"; // -요 구분자로 분리되어 있는걸 토큰이라고 한다.
		StringTokenizer st = new StringTokenizer(cardNumber, "-");
//		StringTokenizer st = new StringTokenizer(cardNumber, "-", true);
		int count = st.countTokens();
		System.out.println(count);
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
