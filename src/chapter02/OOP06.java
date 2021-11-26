package chapter02;
// 제어자, 접근 제어자
import tmp.Unit;

// final class Class01 { ──> final 클래스: 상속이 되지 않는다. 추가나 확장이 불가능
class Class01 {

	int a;

//	final int a() { ───────> final 생성자 : 상속 받을때 그대로 사용해라.
	int a() {
		return 0;
	}

}

class Class02 extends Class01 {

//	final int B = 0; ──────> final 변수 : 절대값
	int b;
	
	int b() {
		return 0;
	}

	int a() {
		return 0;
	}

}

public class OOP06 {

	public static void main(String[] args) {

		Unit_ unit = new Unit_(1, 2, 3, 4, 5);
		
//		System.out.println(unit.mm)); ───> private로 선언되어 있기 때문에 사용이 안된다.
		System.out.println(unit.getMm());
		
		// unit.mm = 3; ───> private 선언 되있어서 사용 불가.
		// set : 바꿔주는
		unit.setMm(3);
		// get : 사용하는
		System.out.println(unit.getMm());
		
		Unit_2 unit2 = new Unit_2();
		
	}

}
