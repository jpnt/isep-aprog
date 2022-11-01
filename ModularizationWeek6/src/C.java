import java.util.Scanner;

public class C {

	public static double ang(double x, double y, double z) {
		double formula = Math.toDegrees(
				Math.acos((Math.pow(x,2) + Math.pow(y,2) - 
				Math.pow(z,2))/(2*x*y)));
		return formula;
	}
	
	public static boolean isValid(double a, double b, double c) {
		if (a+b<=c || a+c<=b || b+c<=a)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		// 1) stdin <- a,b,c
		// 2) check if valid: a+b<=c || a+c<=b || b+c<=a returns false
		// 3) if valid, return calculated angle in degrees

		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if (isValid(a,b,c)) {
			System.out.printf("a=%.2f%n"
					+ "b=%.2f%n"
					+ "c=%.2f%n"
					+ "ang(a,b)=%.2f%n"
					+ "ang(a,c)=%.2f%n"
					+ "ang(b,c)=%.2f%n",
					a, b, c, ang(a,b,c), ang(a,c,b), ang(b,c,a));

		} else
			System.out.println("impossible");

	}

}
