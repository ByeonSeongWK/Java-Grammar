package chapter02;

class Book {

	String title;
	String wrtier;
	int price;

}

public class OOP02 {

	public static void main(String[] args) {

		// 객체 배열
		Book[] books;
		books = new Book[3];

		Book book = new Book();
		Book book1;
//		초기화 되지 않아서 사용 불가. 
//		사용하려면 초기화를 해줘야 한다.

		books[0] = book; // [0]은 주소를 가르킨다. books[0], book이랑 같다
		books[1] = new Book(); // 새로운 주소가 만들어진다.
//		books[2] = book1; // 초기화 되지 않아서 사용 불가

		books[0].title = "달러구트 꿈 백화점";
		books[0].wrtier = "이미예";
		books[0].price = 14800;

		books[1].title = "달러구트 꿈 백화점2";
		books[1].wrtier = "이미예";
		books[1].price = 13800;
		
		book1 = books[1];
		book1.title = "왜 일하는가?";
		
		books[2] = book1;
		
		System.out.println(book.title);
		System.out.println(books[1].title);
		
		for(int i = 0; i < books.length; i++) {
			
			System.out.println("---book---");
			System.out.println("책 : " + books[i].title);
			System.out.println("저자 : " + books[i].wrtier);
			System.out.println("가격 : " + books[i].price);
			
		}
		
	}

}
