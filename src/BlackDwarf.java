import java.util.*;


public class BlackDwarf extends DwarfStar {

	@Override
	public int calculatePressure() {
		return (int) (getRadius() * getRadius());
	}

	@Override
	public void getDetails() {
		System.out.println("The Pressure of the WhiteDwarf Star is " + calculatePressure());
		System.out.println("The Fusion Rate of the WhiteDwarf Star is" + getFusionRate());

	}
	public static void main(String[] args)
	{
		DwarfStar bd = new BlackDwarf();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the constellation name");
		String constellation = sc.nextLine();
		bd.setConstellation(constellation);
		System.out.println("Enter the radius");
		int r = sc.nextInt();
		bd.setRadius(r);
		System.out.println("Enter the pressure");
		int pressure = sc.nextInt();
		bd.setPressure(pressure);
		System.out.println("Enter the fusionrate");
		double fusionRate = sc.nextDouble();
		bd.setFusionRate(fusionRate);
		System.out.println("Enter the temperature");
	    long temperature = sc.nextLong();
	    bd.setTemperature(temperature);
	    bd.getDetails();
	    bd.calculatePressure();
	    
	}

}
