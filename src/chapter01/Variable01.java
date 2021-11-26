package chapter01;

public class Variable01 {
	// 자바는 메인함수가 있어야지만 실행이 가능
	public static void main(String[] args) {
		
		// 변수
		// 데이터를 저장할 메모리 공간
		
		// 선언 : 메모리 공간 할당
		// 초기화 : 할당된 메모리 공간에 첫 데이터를 넣어주는 것.
		
		// 데이터타입 변수명 = 데이터;
		
		// 1. 선언과 함께 초기화
		int num1 = 10;
		// int라는 데이터 타입에 num1이라는 변수에 10이란 데이터를 넣어 주겠다.
		
		// = 대입 연산자 -> "같다" 라는 뜻이 아닌 우항의 값을 좌항에 넣어 주겠다 라는 뜻.
		
		// 2. 선언만 해놓고 사용할때 초기화
		// 선언만 해놓고 사용할때 초기화 해도 된다.
		int num2;
		num2 = 20;
		
		// 초기화를 안하면 사용 불가.
		
		// 작업시엔 2번을 많이 사용.
		
		// 동일한 데이터 타입의 변수를 만들때 한번에 선언해 줄 수 있다. 초기화도 가능.
		int num3, num4 = 30;
		int num5 = 50, num6 = 60;
		
		// 초기화한 변수를 다른 값으로 변경 하고 싶을때
		num3 = 33;
		num4 = 44;
		
		// System.out.println은 디버깅용이다.
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		

//		1) 변수명 첫 글자는 숫자는 불가능하다.
//		int 1num;
		
//		2) 특수 문자는 "$", "_" 만 사용 가능. 특수문자는 대부분 연산자이기 때문에.
//		int !num;
		int $_;
		
//		3) 변수명에 키워드는 사용 할 수 없다.
//		컴퓨터가 인식하지 못하기 때문에.
//		int int
		
		
		
		
	}
	
}
