package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_T {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, i, j, tmp;
		int[] data = new int[10];

		n = 0;

		do {
			data[n] = sc.nextInt();
			n++;
		} while (n < 10);

		for (i = 1; i < 10; i++) {
			tmp = data[i];

			for (j = i - 1; j > -1; j--) {
				if (data[j] > tmp) {
					data[j + 1] = data[j];

				} else {
				break;
				}

			}
			data[j + 1] = tmp;
		}

		System.out.println(Arrays.toString(data));
	}

}