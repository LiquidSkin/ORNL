import java.util.*;

public class WhiteDwarf extends DwarfStar {
	private double opacity;
	private long thermalConductivity;

	public double getOpacity() {
		return opacity;
	}

	public void setOpacity(double opacity) {
		this.opacity = opacity;
	}

	public long getThermalConductivity() {
		return thermalConductivity;
	}

	public void setThermalConductivity(long thermalConductivity) {
		this.thermalConductivity = thermalConductivity;
	}


	@Override
	public int calculatePressure() {
		// TODO Auto-generated method stub
		return(getRadius() * getRadius());
	}

	@Override
	public void getDetails() {
		System.out.println("The Pressure of the WhiteDwarf Star is " + calculatePressure());
		System.out.println("The Fusion Rate of the WhiteDwarf Star is" + getFusionRate());

	}

	public static void main(String[] args) {
		WhiteDwarf w = new WhiteDwarf();
		w.setConstellation("Canoris");
		w.setFusionRate(2.2);
		w.setLuminosity(30);
		w.setName("Regal");
		w.setOpacity(3.9);
		w.setPressure(11);
		w.setRadius(3000);
		w.setTemperature(3500);
		w.setThermalConductivity(22222);
		w.calculatePressure();
		w.getDetails();

	}

	

	
}
