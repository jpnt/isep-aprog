import java.util.Scanner;

public class A {

	public static int countDigit(int num) {
		// more optimized way of counting digits of a number
		if (num == 0)
			return 1;
		else 
			return (int) Math.floor(Math.log10(num) + 1);
	}
	
	public static void main(String[] args) {
		final int K = 5;
		int i = 1;
		
		Scanner scan = new Scanner(System.in);
		int maxDigits = scan.nextInt();
		int num = scan.nextInt();
		
		int sum = num;

		while (maxDigits > countDigit(num) && K != i) {
			num = scan.nextInt();
			// assert once again, after scan input, that digit count of number is lower
			if (maxDigits > countDigit(num)) {
				sum += num;
				i++;
			}
		}
		
		// protect in case digit count is bigger than maxDigits from the get go
		if (i==1) {
			System.out.printf("%.2f%n", (float) 0);
		} else {
			float average = (float) sum / i;
			System.out.printf("%.2f%n", average);
		}
		
	}

}
