package chapter02;
// 상속
import tmp.Unit;
// tmp 패키지에 Unit 클래스에 있는 내용을 사용.
import tmp.Unit.*;

class Person {
	String name;
	String birth;
	int age;
	
	Person(String name, int age, String birth){
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	
	void eat(String food) {
		System.out.println(name + "이 " + food + "를 먹습니다.");
	}
}

class Student extends Person {

	String name;
	String stdNum;
	int grade;
	String school;
	
	public Student(String name, int age, String birth, String stdNum, int grade, String school) {
		// 상속해준 클래스의 생성자에 값을 받아 오는 것.
		// super를 써야지만 상속 받은 클래스의 생성자 사용 가능.
		super(name, age, birth);
		
		// 자기 자신의 값도 넣어 줘야 한다.
		this.stdNum = stdNum;
		this.grade = grade;
		this.school = school;
		
		///// 매개변수의 위치 \\\\\
		// 입력 받은 매개변수
		System.out.println(name);
		// 본인의 매개변수(Student)
		System.out.println(this.name);
		// 상속 받은 클래스의 매개변수(Person)
		System.out.println(super.name);
	}

	void goSchool() {		// 만약 Student에도 String name이 있으면 Student에 name은 this.name
									// Person에 name을 찾아가고 싶으면 super.name
		System.out.println(super.name + "이 " + this.school + "에 등교합니다.");
	}
	
	// 오버라이딩
	void eat(String food) {
		System.out.println(this.name + "이 " + this.school + "에서 "+ food + "를 먹습니다.");
	}
	
}

class Employee extends Person {
	// 인스턴스 변수
	int empNum;
	String part;
	String grade;
	
	public Employee(String name, int age, String birth, int empNum, String part, String grade) {
		super(name, age, birth);
		this.empNum = empNum;
		this.part = part;
		this.grade = grade;
	}

	void changePart(String part) {
		System.out.println(this.name + "의 부서가 " + this.part + "에서 " + part + "로 변경됩니다.");
		// 인스턴스 변수를 입력 받은 매개변수로 값을 바꾼다.
		this.part = part;
		
	}
}

public class OOP05 {

	public static void main(String[] args) {

		Student student1 = new Student("홍길동", 16, "10.22", "20200125", 2, "한국 중학교");
		Employee employee = new Employee("김길동", 26, "01-27", 12552, "인사과", "사원" );
		
//		student1.name = "홍길동";
//		student1.age = 16;
//		student1.birth = "10.22";
//		student1.stdNum = "20200125";
//		student1.grade = 2;
//		student1.school = "한국 중학교";

		System.out.println(student1.name);
		student1.eat("사과");
		// super class에 eat 이 있지만 sub class에서 eat을 오버라이딩을 했기 때문에
		// 오버라이딩한 메서드가 출력이 된다. 제일 하위에 있는 것을 출력
		student1.goSchool();
		
		// import문
		// ※ 패키지가 다를시! 같으면 그냥 호출 가능
		// 외부에 특정한 기능을 만들어 놓고
		// 중복된 기능을 import를 해서 사용
		System.out.println(Unit.ft);
	
		// 패키지 내부에 있는건 이렇게 불러 올 수 있다.
		OOP04 oop04 = new OOP04();
	}

}
