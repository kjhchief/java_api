package ezen.api;

public class CharacterExample {

	public static void main(String[] args) {
		char c = 'A';
		boolean result = Character.isUpperCase(c);
		System.out.println(result);
		
		result = Character.isDigit(c);
		System.out.println(result);
	}

}
