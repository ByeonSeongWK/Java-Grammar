package chapter02;

// 오버로딩
// 같은 이름의 메서드로 여러개를 만들 수 있다.
class MyMath {

	static int add(int a, int b) {
		return a + b;
	}

//	 오버로딩을 제공하지 않을 시
//	int add2(int a, int b, int c) {
//		return a + b + c;
//	}

	// 오버로딩 해줄 시
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// 반환타입이 다르더라도 오버로딩에 영향을 미치지 못한다.
	/*
	 오버로딩이 안되는 경우
	static float add(int a, int b) {
		return (float)a + (float)b;
	}*/
	
	// 오버로딩
	// 매개변수가 타입이 다르면 오버로딩이 가능하다.
	static float triArea(int width, int height) {
		return (float)width * (float)height / 2;
	}
	
	static float triArea(float width, int height) {
		return width * (float)height / 2;
	}
	
	static float triArea(int width, float height) {
		return (float)width * height / 2;
	}
	
	static float triArea(float width, float height) {
		return width * height / 2;
	}

}
///////////////////////////////////
class Triangle {
	
//	1. 명시적 초기화
//	int height = 40;
	int height;
	int width;
	float area;
/////// ↑ 이런 것을 bin이라고 한다./////
	
	
	// 메소드라 오버로딩이 가능하다.
	Triangle(){
		// 아래의 Triangle(int height, int width)를 그대로 들고온다.
		this(40, 30);
		height = 20;
		width = 30;	
		area = MyMath.triArea(width, height);
		System.out.println("삼각형이 생성되었습니다.");
	}
	
	// 인스턴스가 인스턴스화 되는 동시에 값을 가진다.
	Triangle(int height, int width) {
//		this(); // 위의 Triangle() 이라는 생성자를 그대로 들고 온다.
		System.out.println(this.height);
		System.out.println(this.width);
		this.height = height;
		this.width = width;
		area = MyMath.triArea(width, height);
		System.out.println("삼각형이 생성되었습니다.");
	}
	// this : 자기 자신을 가르킨다.
	// 클래스에 포함되어 있는 인스턴스 변수다
	// 라고 하면 this. 을 찍어서 구분을 지어 줘야 한다.
	
	// this.이 없으면 매개변수나 지역변수를 가르킨다.
	// this.이 있으면 클래스에 포함 되어 있는 인스턴스 변수이다.
}

public class OOP04 {

	public static void main(String[] args) {

		int rs1 = MyMath.add(1, 2);
		int rs2 = MyMath.add(3, 4, 5);
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("---------");
		
		Triangle tri1 = new Triangle(70, 20);
//		Triangle tri2 = new Triangle();
		System.out.println(tri1.height);
		System.out.println(tri1.width);
		System.out.println(tri1.area);
		
	}

}
