package chapter01;

public class String01 {

	public static void main(String[] args) {

		// 문자열 String
		// 웹 개발은 문자열로 구성 되어 있어서 매우 중요하다.
		
		char[] str1 = {'a', 'p', 'p', 'l', 'e'};
		String str2 = "apple";
		
		// 몇 번째 index의 값을 가져와라. 
		System.out.println(str2.charAt(4));
		System.out.println(str2.indexOf('1'));
		
		// 정수형은 값이 동일한지 연산자로 확인 가능
		int n1 = 0, n2 = 1;
		System.out.println(n1 == n2);
		
		// 문자열은 값이 동일한지 객체.equals(값)으로 확인 가능 jdk.8
		System.out.println(str2.equals("apple"));
		
		// jdk.11 부터는 가능
		System.out.println(str2 == "apple");
		
		// 문자열 변경 방법 객체.replace(바꾸기전 문자, 바꿀 문자)
		// 대신 동일한 문자는 다 같이 바뀐다.
		str2 = str2.replace("p", "P");
		System.out.println(str2);
		
		str2 = str2.replaceAll("P", "p");
		System.out.println(str2);
		
		// 처음 문자만 바꿀 경우 jdk.11 에서는 .replaceFirst 사용
		// jdk.8은 replace로 하나만 바뀐다
		str2 = str2.replaceFirst("p", "P");
		System.out.println(str2);
		
	}

}
