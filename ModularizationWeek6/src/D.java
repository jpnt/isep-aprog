import java.util.Scanner;

public class D {
	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return(num * factorial(num-1));
	}
	
	public static int combinations(int m, int n) {
		return(factorial(m) / (factorial(n) * (factorial(m-n))));
	}

	public static int permutations(int m, int n) {
		return(factorial(m) / factorial(m-n));
	}

	public static void main(String[] args) {
		// calculate: combinations and permutations of elements
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		if (m >= n) {
			System.out.printf("C(%d,%d)=%d%n"
					+ "P(%d,%d)=%d%n",
					m, n, combinations(m,n), m, n, permutations(m, n));
		}
		
	}

}
