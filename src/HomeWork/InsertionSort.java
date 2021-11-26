package HomeWork;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int n, i, j, tmp;
		int[] data = {20, 40, 42, 50, 111, 50, 5, 22, 60, 98 };

		n = 0;

		do {
			n++;
		} while (n < 10);
			for (i = 1; i < 10; i++) {
				tmp = data[i];
				
				for (j = i - 1; j > -1; j--) {
					if (data[j] > tmp) {
						data[j + 1] = data[j];
						
					} else { break;}
					
				}
				data[j + 1] = tmp;
			}

		
		System.out.println(Arrays.toString(data));
	}

}