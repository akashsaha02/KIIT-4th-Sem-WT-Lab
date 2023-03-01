import java.util.*;

public class PlasticCost {

	double sheet2D(double length, double width) {
		double cost = length * width * 40;
		return cost;
	}

	double box3D(double length, double width, double height) {
		double cost = length * width * height * 60;
		return cost;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the dimension for 2D sheet: ");
		double a2d = scan.nextDouble();
		double b2d = scan.nextDouble();

		System.out.println("Enter the dimension for 3D box: ");
		double a3d = scan.nextDouble();
		double b3d = scan.nextDouble();
		double c3d = scan.nextDouble();

		PlasticCost pc = new PlasticCost();

		double costSheet = pc.sheet2D(a2d, b2d);
		System.out.println("Cost of 2D Sheet : " + costSheet);

		double costBox = pc.box3D(a3d, b3d, c3d);
		System.out.println("Cost of 3D Box : " + costBox);
	}
}
