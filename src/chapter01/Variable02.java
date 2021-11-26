package chapter01;

public class Variable02 {

	public static void main(String[] args) {

		// 데이터 타입
		// 데이터의 형태는 정수형태, 실수형태, 문자형태, 논리형태 존재
		
		// 정수형태
		// byte, short, int, long
		
		// byte는 1byte 크기를 가짐(범위 : -128~127)
		byte by1 = 127;
		byte by2 = -128;
//		↓ 크기가 안맞아서 넣을 수 없다.
//		byte by3 = 128;
//		byte by4 = -129;
		
		// short는 2byte 크기를 가짐(범위 : -32,768 ~ 32767)
		short s1 = 32_767; // 3칸 기준으로 ","(쉼표) 대신 "_"(언더바)를 사용 가능하다.
		short s2 = -32_768;
//		↓ 크기가 안맞아서 넣을 수 없다.
//		short s3 = 32768;
//		short s4 = -32769;
		
		// int는 4byte 크기를 가짐(범위 : -2,147,483,648 ~ 2,147,483,647)
		int i1 = 2_000_000_000;
		int i2 = -2_000_000_000;
//		↓ 크기가 안맞아서 넣을 수 없다.
//		int i3 = 3_000_000_000;
//		int i4 = -3_000_000_000; <-- 들어가는 값을 literal(리터럴 : 데이터 자체, 변경 불가능) 이라고 함.
//		오류코드 : The literal --- of type int is out of range // byte, short랑 오류 코드가 다르다(Type mismatch)
		
		// long는 8byte 크기를 가짐
		long l1 = 3_000_000_000L;
		long l2 = -3_000_000_000L;
		
		// literal이 가지고 있는 기본 데이터 타입은 int 즉 4byte이다.
		// 그러므로 long 타입으로 인지하라는 접미사를 붙여야 한다.(접미사는 대문자로 붙이길 권장)
		
		int sum1 = 0;
		sum1 = 2_000_000_000 + 1_000_000_000;
		
		long sum2;
		sum2 = 2_000_000_000L + 1_000_000_000L; 
		
		System.out.println(sum1); // <-- 메모리 값에 초과한 용량이 들어오면 짤려서 나온다. 이것을 오버플로우라고 한다.
		System.out.println(sum2);
		
		// 실수형태
		// float, double
		
		// float은 4byte 값을 가짐
		float f1 = 0.12345678F;
		//	실수형태 기본 literal 타입은 double이다. 접미사를 붙여줘야함.
		// 소수점 8자리까지 표현.
		System.out.println(f1);

		// double은 8byte 값을 가짐
		// 소수점 16자리까지 표현.
		double d1 = 0.666666666666666666;
		System.out.println(d1);
		
		// 문자형태
		// char (캐릭터) 2byte 값을 가짐
		char c1 = 'a';
		char c2 = '0'; // <-- 숫자 0이 아닌 문자 0 이다. 연산은 안됨.
		char c3 = 97; // <-- 유니코드 97인 a가 나온다.
		char c4 = 48;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		// 논리형태
		// boolean(false(거짓,0), true(참, 1))
		// boolean 1byte를 가짐
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		// 문자열 --> 기본형 타입 x -->  참조형 타입이다.
		// String
		// char은 ''(작은따옴표) String은 ""(큰따옴표) 사용.
		
		String str = "안녕하세요.";
		System.out.println(str);
		
		// 형변환
		// 자동 형변환과 명시적 형변환이 존재한다.
		
		// 자동 형변환
		byte n1 = 127;
		int n2 = n1;
		short n3 = 30000;
		n2 = n3;
		
		// 명시적 형변환
		// 우항 (넣고자 하는 데이터) 앞에 '(변환하고자 하는 데이터 타입)'
		
		float n4 = 3.14F;
		long n5 = 3_000_000_000L;
		
		// 실수를 정수로 강제 형변환을 하면 소수점은 다 버린다.
		n2 = (int)n4;
		System.out.println(n2);
		
		n2 = (int)n5;
		System.out.println(n2);
		
		// 상수
		// 한번 초기화되면 바꿀수 없는 메모리 공간
		// 데이터 자체에 이름을 붙여주는 행위이다.
//		literal도 상수이다.(변하지 않는 값)
//		10 = 15;
		
		// final 데이터타입 상수명 = 데이터;
		
		final int MAX = 15;
		System.out.println(MAX);
//		MAX = 20; <-- 다시 초기화 X
		
		final int MIN;
		MIN = 3;
//		MIN = 5;   <-- 처음만 초기화 가능, 그 이후 X
		
	}

}
