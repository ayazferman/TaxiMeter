import java.util.Scanner;

public class TaxiMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double perKm=2.20, total;
		int km, startPrice=10;
		System.out.println("Enter the distance in KM: ");
		km=scan.nextInt();
		total=(km*perKm)+startPrice;
		total=total< 20 ? 20 : total;
		System.out.println("Total price amount= " + total);
		

	}
}
