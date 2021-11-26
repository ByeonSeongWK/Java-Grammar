package chapter02;
// 인터페이스
interface My_interface {
	
	public static final int n = 0;
	public abstract void method1();
	
}

interface My_interface2 {
	
	public static final int n2 = 10;
	public abstract void method2();
	
}
// 상속은 단일 상속만 가능하지만 인터페이스는 가능하다. 여러가지 "기능"을 사용하기 위해서
class My_class implements My_interface, My_interface2 {

	@Override
	public void method1() {
		System.out.println(n);
	}

	@Override
	public void method2() {
		System.out.println(n);
	}
	
}
	
public class OOP09 {

	public static void main(String[] args) {

		My_class cl = new My_class();
		cl.method1();
		cl.method2();
		
	}

}
