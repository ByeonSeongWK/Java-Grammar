package HomeWork;

public class sequence1 {

	public static void main(String[] args) {

		int i = 0, j = 0;
		
		do {
		i++;
		j+=i;
		} while(i < 100);
		System.out.println("더한 개수 : " + i);
		System.out.println("총합 : " + j);
	}

}