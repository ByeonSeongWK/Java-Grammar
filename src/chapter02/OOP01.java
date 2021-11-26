package chapter02;

class Person1 {
	// 클래스 변수(static을 붙이면)
	// 이 클래스로 만든 것은 다 똑같은 값을 가지게함.
	static String contury = "korea";
	
	// Person1에 대한 특성을 만듦.
	String name;
	int      age;
	String tel;
	String address;
	
	// 메서드 : 각각의 기능을 가진다.
	//				↓ 매개변수
	void eat(String food){
		System.out.println(name + " 이/가");
		System.out.println(food + "를 ");
		System.out.println("먹습니다.");
	}
	
	int nextAge(){
		// ↓ 반환값은 return(ex) int type에 반환값을 가져야 한다.)
		return age + 1;
	}
//	void 메서드는 return(반환값)값을 줄 수 없다. <그냥 return;은 가능>
//	↓반환값X         ↓ 받아오는 매개변수X
	void getInfo() {
		System.out.println("-------" + name +"의 정보-------");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
	// 주소값을 전달을 받았다(직접 주소를 찾아가서 값을 변경함) -> 원래 값이 바뀐다.
	void ridingCar1(Car c) {
		System.out.println(name + "이 " + c.cc + "배기량 차량을 탑승합니다.");
		c.cc = 2000;
		System.out.println("c의 배기량을 2000으로 변경했습니다.");
	}
	
	// 값만 가져와서 변수에 담는다 -> 그 뒤에 변수 값을 바꾼다 -> 원래 값은 그대로이다. 
	void ridingCar2(int cc) {
		System.out.println(name + "이 " + cc + "배기량 차량을 탑승합니다.");
		cc = 2000;
		System.out.println("c의 배기량을 2000으로 변경했습니다.");
	}
	
	// 참조형 타입 : 주소값을 반환
	Car changeCar(Car c) {
		
		Car car = c;
		car.type = "세단";
		car.cc = 3000;
		
		return car;
		
	}
	
}
// 클래스 작성시 무조건 첫 글자는 대문자(규칙)
class Car{
	
	String type;
	int cc;
	
	// static 키워드
	static void sell() {
		System.out.println("자동차를 구매합니다.");
	}
}

public class OOP01 {
	
	public static void main(String[] args) {
		
		// 1. 객체 선언과 생성
		//				↓ 참조 변수라고도 함
		Person1 man;				// 객체 선언
		man = new Person1();	// 객체 생성
		
		// 2. 객체를 선언과 동시에 생성
		Person1 woman = new Person1();
		
		Car car = new Car();
		car.type = "SUV";
		car.cc = 2500;
	
		// 객체 man의 특성 부여
		man.name = "홍길동";
		man.age = 30;
		man.tel = "010-1111-1111";
		man.address = "부산광역시";
	
		// 객체 woman의 특성 부여
		woman.name = "이영희";
		woman.age = 28;
		woman.tel = "010-2222-2222";
		woman.address = "울산광역시";
		
		// 이렇게 출력시 객체의 주소값을 나타내준다.
		System.out.println(man);
		System.out.println(woman);
		
//		출력값
//		chapter02.Person1@5594a1b5
//		chapter02.Person1@6a5fc7f7
//		어디에 있는?	↑			@ 주소값
		
		System.out.println("객체의 이름은 : " + man.name);
		System.out.println("객체의 이름은 : " + woman.name);
		System.out.println("-----------------");
		
		man.eat("사과");
		System.out.println(man.nextAge());

		// Person Info 메서드
		man.getInfo();
		woman.getInfo();
		
		Person1 man2 = new Person1();
		
		// 클래스 변수 
		// ※ 객체를 생성하지 않고 클래스 자체에서 바로 사용 가능(모든 클래스의 공통점들을 지정)
		System.out.println(man.contury);
		System.out.println(woman.contury);
		System.out.println(man2.contury);
		System.out.println(Person1.contury);
		System.out.println("-----------------");

		System.out.println(car.cc);
		man.ridingCar1(car);
		System.out.println(car.cc);
		
		car.cc = 2200;
		System.out.println("-----------------");
		
		System.out.println(car.cc);
		man.ridingCar2(car.cc);
		System.out.println(car.cc);
		
		
		// [참조형 변수]
		Car car2 = man.changeCar(car);
		System.out.println(car);
		System.out.println(car2);
		// car 와 car2가 가르키는 메모리 공간(주소)은 같다.
		// 참조형으로 했을시 주소 그 자체를 가져오기 때문에 동일.
		
		System.out.println(car.type);
		System.out.println(car2.type);
		
		car2.type = "SUV";
		System.out.println(car.type);
		System.out.println(car2.type);
		// 똑같은 메모리 공간을 가르키고 있기 때문에 그 자체의 값을 바꿔버렸다.
		
		car.sell();
//		static 으로 선언되어 있다. -> 객체 생성 없이 바로 사용 가능.
		System.out.println();
	}
}