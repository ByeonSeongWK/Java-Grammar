package chapter01;

public class Operator02 {

	public static void main(String[] args) {

		// [연산자2]
		// 비교연산자 : 좌항을 기준으로 우항과 비교
		//                └ a와 b가 같다 X -> a가 b랑 같다 O
		
		int a = 10, b = 20, c = 10;
		
		// ==(같다)
		System.out.println(a == b);
		System.out.println(a == c);
		
		// !=(다르다)
		System.out.println(a != b); // 다르기 때문에 true가 나온다.
		System.out.println(a != c);
		
		// <(작다), >(크다)
		System.out.println(a < b);
		System.out.println(a > b);
		
		System.out.println(a < c); // 같으면 거짓을 반환
		System.out.println(a > c);
		
		// <=(작거나 같다), >=(크거나 같다)
		System.out.println(a <= c);  // 같으면 참을 반환
		System.out.println(a >= c);
		
		System.out.println("------");
		
		// 논리 연산자 : &&(and), ||(or), !(not)
		
		boolean b1 = true, b2 = false, b3 = true, b4 = false;
		
		// !(not) : 부정 연산
		System.out.println(!b1); // 결과값 역전
		System.out.println(!b2);
		
		// &&(and) : 논리곱 연산
		System.out.println(b1 && b3);
		System.out.println(b1 && b4);
		System.out.println(b2 && b3);
		System.out.println(b3 && b4);
		
		// ||(or) : 논리합 연산
		System.out.println(b1 || b3);
		System.out.println(b1 || b4);
		System.out.println(b2 || b3);
		System.out.println(b3 || b4);
		
		System.out.println("-----------");
		System.out.println(true && true || false);
		// ||(논리합)을 계산할때 좌항이 이미 true기 때문에 false까지 연산을 하지 않음
		
		boolean a1;
		
		// a1 = (a++ > 10) && (b++ < 10);
		System.out.println("a: " + a + " b : " + b);
		// System.out.println(a1);
		
		System.out.println("");
		
		// a = 10, b = 20
		a1 = (a++ > 10) && (++b < 10); // 앞에서 거짓이였기 때문에 뒤에 연산을 하지 않는다. b값 변경X
		System.out.println("a1 : " + a1);
		System.out.println("a: " + a + " b : " + b);
		
		a1 = ((a += 20) > 10) || (b++ < 10); // 앞에서 참이였기 때문에 뒤에 연산을 하지 않는다. b값 변경X
		System.out.println("a1 : " + a1);
		System.out.println("a: " + a + " b : " + b);
		
	}

}
