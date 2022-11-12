import java.util.Scanner;

public class B {
	public static Scanner scan = new Scanner(System.in);

	public static final int MAX = 100;
	
	public static int[] readPositiveIntegers() {
		int[] arr = new int[MAX];
		
		int num = scan.nextInt();

		for (int i = 0; num > 0; i++) {
			arr[i] = num;
			num = scan.nextInt();
		}
		return arr;
	}
	
	public static int minimumValue(int[] arr) {
		int min = arr[0];
		
		for (int i = 1; i < arr.length && arr[i] > 0; i++) {
				if (arr[i] < arr[i-1]) {
					min = arr[i];
				}
		}
		return min;
	}

	public static int valueCount(int num, int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = readPositiveIntegers();
		// Protect against non-positive numbers, stopping further execution
		// of the algorithm
		if (arr[0] > 0) {
			int min = minimumValue(arr);
			int occurrences = valueCount(min, arr);

			System.out.printf("min=%d\n", min);
			System.out.printf("occurrences=%d\n", occurrences);
		}
	}
}
