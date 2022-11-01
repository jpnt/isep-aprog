import java.util.Scanner;

public class G {
	
	public static int countDigits(int num) {
		int digitCount = 1;
		while (num > 9) {
			num/=10;
			digitCount++;
		}
		return digitCount;
	}

	public static boolean isArmstrong(int num) {
		int digitCount = countDigits(num);
		int originalNum = num;
		int sum = 0;

		while (num > 0) {
			int mostRightNum = num % 10;
			sum += Math.pow(mostRightNum, digitCount);
			num/=10;
		}

		if (sum == originalNum || digitCount == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();

		for (int i = 0; i <= num; i++) {
			if (isArmstrong(i))
				System.out.printf("%d\n", i);
		}

	}

}
