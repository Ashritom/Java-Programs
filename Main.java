import java.util.Scanner;
class Courier{
	private static final double STAMP_COST = 2.0;
	private static final double CITY_DELIVERY_COST = 20.0;
	private static final double OTHER_DELIVERY_COST = 40.0;
	public static void calculateCost(){
	Scanner scanner = new Scanner(System.in);
	for(int i=0;i<=5;i++){
		System.out.println("Enter weight of parcel "+ i +" (in kg): ");
		double weight = scanner.nextDouble();
		System.out.println("Enter delivery location( 1 for within the city , 2 for other): ");
		int location = scanner.nextInt();
		double cost = weight*STAMP_COST;
		if(location == 1){
			cost+=CITY_DELIVERY_COST;
			}
			else{
				cost+=OTHER_DELIVERY_COST;
			}
		System.out.println("Total cost for parcel "+i+" is $ "+cost);
		}
	}
}
public class Main{
public static void main(String[] args)
{
Courier.calculateCost();
}
}