import java.util.Scanner;

public class H {

	public static int reverseNum(int num) {
		int sum = 0;

		while (num > 0) {
			int mostRightNum = num % 10;
			sum = sum * 10 + mostRightNum;
			num /= 10;
		}
		return sum;
	}
	
	public static boolean isPalindrome(int num) {
		int reverse = reverseNum(num);

		if (reverse == num)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int attempts = 1;
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		// System.out.printf("%s", isPalindrome(num)); //debug
		
		while (isPalindrome(num) == false && attempts < 5) {
			num = scan.nextInt();
			attempts++;
		}
		
		if (attempts == 5)
			System.out.printf("attempts exceeded\n");
		else
			System.out.printf("palindrome\n");
	}

}
