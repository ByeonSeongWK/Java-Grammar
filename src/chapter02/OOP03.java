package chapter02;

import java.util.Scanner;
// 객체 배열
public class OOP03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Book[] books = new Book[3];
		
//		Book book = new Book();
//		여기 선언을 하면 하나의 객체만 생성하고
//		하나의 객체에 돌아가면서 값을 넣어 마지막 값으로만 출력 된다.
		
		for(int i = 0; i < 3; i++) {

			// 반복문을 한번 돌때마다 객체를 하나 생성			
			Book book = new Book();

			sc =new Scanner(System.in);

			book.title = sc.nextLine();
			book.wrtier = sc.nextLine();
			book.price = sc.nextInt();
			
			books[i] =  book;
	
		}
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("-----book-----");
			System.out.println("책  : " + books[i].title);
			System.out.println("저자  : " + books[i].wrtier);
			System.out.println("가격  : " + books[i].price);
		}
		
	}

}
