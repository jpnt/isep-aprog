import java.util.Scanner;

public class E {

	// we use a global variable so count does not get initialized
	// every time we recurse the commonDigits function/method
	static int count = 0;
	public static int commonDigits(int x, int y) {
		// returns number of digits in same position
		// System.out.printf("x=%d, y=%d\n", x, y); // debug
		if (x%10 == y%10)
			count++;
		if (x/10 > 0 && y/10 > 0) 
			return(commonDigits(x/10, y/10));

		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pairs = scan.nextInt();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int higher = commonDigits(num1,num2);

		while (pairs > 1) {
			int num3 = scan.nextInt();
			int num4 = scan.nextInt();
			
			// we need to zero out the count variable before and after the function call
			// so that it does not accumulate as we call it multiple times
			count = 0; int lower = commonDigits(num3,num4); count = 0;
			// System.out.printf("higher=%d, lower=%d\n", higher, lower); // debug
			
			if (higher <= lower) {
				num1 = num3;
				num2 = num4;
			}
			higher = commonDigits(num1,num2);
			pairs--;
			// System.out.printf("higher=%d, lower=%d\n", higher, lower); // debug
		}

		if (higher == 0)
			System.out.println("no results");
		else
			System.out.println(num1 + "/" + num2);

	}

}
