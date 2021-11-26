package chapter02;
// 다형성
class A {

	int a1;
	int a2;

}

class B extends A {

	int b1;
	int b2;

}

class C extends A {

	int c1;
	int c2;

}

public class OOP07 {

	public static void changeData(A a) {

		a.a1 = 10;
		a.a2 = 20;

	}
	// A에만 매칭될 수 있는 주소
	public static A setData(A a) {
		
		a.a1 = 20;
		a.a2 = 10;
		
		return a;
	}

	public static void main(String[] args) {

		A a = null;
		B b = new B();
		C c = new C();
		B bb;

		b.b1 = 1;
		a = b;

//		b2 = a;
		bb = (B) a;

		bb.b1 = 3;
		// 주소값은 다 같다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(bb);
		// a는 주소값을 표현을 못하는 것이다.
		// 표현을 하게 해주려면 참조타입으로 강제형변환 시키면 된다.

		System.out.println(bb.b1);
		System.out.println(b.b1);

		changeData(b);
		System.out.println(b.a1);
		System.out.println(b.a2);

		changeData(c);
		System.out.println(c.a1);
		System.out.println(c.a2);

//		a.b1 = 2; X

		B bbb = (B) setData(bb);
		C cc = (C) setData(c);
		System.out.println(bbb.a1);
		System.out.println(bbb.a2);
		System.out.println(cc.a1);
		System.out.println(cc.a2);
		
		A a1 = new B();
		A a2 = new C();
		
	}

}
