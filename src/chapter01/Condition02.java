package chapter01;

public class Condition02 {

	public static void main(String[] args) {

		// switch 조건문

		/*
		 * switch(변수) { case v1: case v2: case v3: ... default: }
		 */

		// case에는 변수 형태는 들어갈 수 없다.(상수값만 적용)
		// default는 else와 같다. 동일값이 없을시 실행
		// break는 어느 시점부터 실행할지 표시(break를 만나면 중괄호 탈출)
		// break가 없으면 다음 케이스의 내용까지 출력.

		int a = 3;
		int n1 = 1;

		switch (a / n1) {
		case 1:
			System.out.println("a는 1입니다.");
			break;
		case 3:
			System.out.println("a는 3입니다.");
		case 5:
			System.out.println("a는 5입니다.");
			break;
		default:
			System.out.println("a는 1, 3, 5가 아닙니다.");
		}
	}
}
