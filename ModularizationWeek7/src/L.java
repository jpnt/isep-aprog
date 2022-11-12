import java.util.Scanner;

public class L {

	public static int wordCount(String str) {
		int count = 1;
		
		// Protection against no input...
		if (str.length() == 0)
			return 0;
		
		// ...and blank spaces
		if (str.charAt(0) == ' ')
			count = 0;
		
		// Arrays start at zero so last char is length() - 1
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		
		System.out.printf("%d\n", wordCount(phrase));
		
	}

}
