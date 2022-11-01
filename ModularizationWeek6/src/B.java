import java.util.Scanner;

public class B {
	
	public static String stars(int num) {
		String stars = "";
		while (num > 0) {
			stars += "*";
			num--;
		}
		return stars;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int studentCount = scan.nextInt();
		int subjectCount = scan.nextInt();
		
		if (subjectCount > 0) {
			for (int i = 0; subjectCount > i; i++) {
				String subject = scan.next();
				int approved = scan.nextInt();
				
				int failed = studentCount - approved;
				
				System.out.print("Subject: " + subject + "\n- Approved: " +
						stars(approved) + "\n- Failed: " + stars(failed) + "\n");
			}
			
		}

	}

}
