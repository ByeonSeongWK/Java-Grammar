package chapter01;

public class Operator01 {

	public static void main(String[] args) {

		// [연산자]
		// 산술연산, 비교연산, 단항연산, 논리연산, 대입연산
		
		// 산술연산 : +, -, *, /, %
		int a = 10, b = 3;
		float c = 3.0F;
		
		System.out.println("int");
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println("float");
		
		System.out.println(a + c);
		System.out.println(a - c);
		System.out.println(a * c);
		System.out.println(a / c);
		System.out.println(a % c);
		System.out.println("---------------");
		
		// 대입 연산자 : =, +=, -=, *=, /=, %=
		
		int n = 0;
		
		n += 5;
		System.out.println(n);
		
		n -= 3;
		System.out.println(n);
		
		n *= 3;
		System.out.println(n);
		
		n /= 5;
		System.out.println(n);
		
		n %= 3;
		System.out.println(n);
		
		System.out.println("---------------");
		// 증감 연산자
		// ++, --
		
		// 전위 증감
		int num = 5;
		System.out.println(++num); // 1증가  num 자체가 6이 된다.
		System.out.println(--num);	 //  1감소
		
		// 후위 증감
		System.out.println("num : " + num);
		System.out.println("num++ : " + num++);
		System.out.println("num : " + num);
		System.out.println("num-- : " + num--);
		System.out.println("num : " + num);
		
		System.out.println("---------------");
		System.out.println("num : " + num);
		System.out.println(++num + 3);
		System.out.println("num : " + num);
		System.out.println(num++ + 3);
		System.out.println("num : " + num);
		
		
	}

}
