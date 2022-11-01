import java.util.Scanner;

public class F {

	// static final double pi = 3.14159;

	public static double cylinderVolume(double r, double h) {
		double volume = Math.PI * (Math.pow(r, 2) * h);
		return volume;
	}
	
	public static double coneVolume(double r, double h) {
		// cone volume is one third of cylinder volume
		return(cylinderVolume(r, h) / 3.0);
	}
	
	public static double sphereVolume(double r) {
		double volume = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
		return volume;
	}
	
	public static void main(String[] args) {
		double radius, height;

		Scanner scan = new Scanner(System.in);
		String type = scan.next();
		
		while (!type.equals("end")) {
			switch (type) {
			case "cylinder":
				radius = scan.nextDouble();
				height = scan.nextDouble();
				System.out.printf("%.2f\n", cylinderVolume(radius, height));
				break;
			case "cone":
				radius = scan.nextDouble();
				height = scan.nextDouble();
				System.out.printf("%.2f\n", coneVolume(radius, height));
				break;
			case "sphere":
				radius = scan.nextDouble();
				System.out.printf("%.2f\n", sphereVolume(radius));
				break;
			default:
				break;
			}

			type = scan.next();
		}
		

	}

}
