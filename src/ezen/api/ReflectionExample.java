package ezen.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		String message ="리플렉션이 뭡니까"; // 이거 타입 모른다고 가정
		
		// String 객체에는 어떤 속성과 어떤 메소드가 있는지 분석
		Class cls = message.getClass();
		String className = cls.getName();
		System.out.println(className);
		Method[] methodList = cls.getMethods();
		for (Method method : methodList) {
			String methodName = method.getName();
			int modifier = method.getModifiers();
			System.out.println(Modifier.PUBLIC);
			System.out.println(modifier);
			System.out.println(method.toString());
			System.out.println(method.getReturnType());
		}
		
		 Field[] fieldList= cls.getFields();
		 for (Field field : fieldList) {
			System.out.println(field);
		}
		 
		// Class 인스턴스를 획득하는 방법 3가지
		Class cls2 = new Integer(10).getClass();
		Class cls3 = Class.forName("java.lang.Integer");
		Class cls4 = Integer.class;
		// 이걸 통해 위에처럼 Integer 클래스의 정보를 본다. getName, getMethod 등
		System.out.println(cls4.getPackageName());
		

	}

}
