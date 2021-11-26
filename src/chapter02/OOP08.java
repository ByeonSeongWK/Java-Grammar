package chapter02;
// 추상클래스, 추상메서드 (기획과 설계의 입장)
abstract class A1 {

	int a1;
	int a2;

	abstract void printA12();
}

class B1 extends A1 {
	void printA12() {

	}

}

class B2 extends A1 {
	void printA12() {

	}

}

public class OOP08 {

	public static void main(String[] args) {
		B1 b1 = new B1();
		B2 b2 = new B2();
//		A1 a1 = new A1();
//		기능이 구현되지 않는다.
// 추상클래스는 객체를 만들기 위한 것이 아닌 클래스를 만들기 위한 클래스이다.

		b1.a1 = 1;
		b1.a2 = 2;

		b2.a1 = 1;
		b2.a2 = 2;

		b1.printA12();
		b2.printA12();

	}

}
