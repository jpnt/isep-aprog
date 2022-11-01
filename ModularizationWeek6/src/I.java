import java.util.Scanner;

public class I {
	
	// fib(n) = fib(n-1) + fib(n-2); fib(0) = 0; fib(1) = 1
	public static int fibonacci(int num) {
		if (num == 0)
			return 0;
		else if (num == 1)
			return 1;
		else
			return(fibonacci(num-1) + fibonacci(num-2));
	}

	public static void main(String[] args) {
		int i = 0; // index

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (i = 0; fibonacci(i) < num; i++);
		
		// System.out.printf("i=%d, fib(i)=%d, num=%d\n", i, fibonacci(i), num); //debug
		
		if (fibonacci(i) == num)
			System.out.printf("is a Fibonacci number\n");
		else
			System.out.printf("is not a Fibonacci number\n");

	}

}
