package HomeWork;

public class sequence2 {

	public static void main(String[] args) {

		int i = 0, j = 0;
		boolean sw = false;

		do {
			i++;
			if (sw == false) {
				j += i;
				sw = true;
			} else{
				j -= i;
				sw = false;
			}
		} while (i < 100);
		System.out.println(j);
	}

}
