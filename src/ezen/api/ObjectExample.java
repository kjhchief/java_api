package ezen.api;

public class ObjectExample {

	public static void main(String[] args) {
		Account account = new Account("1111-1111", "김재훈", 1234, 10000);
		System.out.println(account);
		
		// 복제 방법 1 (얇은 복사. 정확하게는 공유의 개념.)
		Account account2 = account;
		
		// 복제 방법 2 (깊은 복사. clone)
		Object obj;
		try {
			account2 = (Account)account.clone();
			System.out.println(account2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
