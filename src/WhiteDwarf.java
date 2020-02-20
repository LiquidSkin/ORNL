
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

	public String calculateSpectrum() {
		return null;
	}

	@Override
	public double calculatePressure() {
		setPressure(getRadius() * getRadius());
		return 0;
	}

	@Override
	public void getDetails() {
		System.out.println("The Pressure of the WhiteDwarf Star is " + getPressure());
		System.out.println("The Fusion Rate of the WhiteDwarf Star is" + getFusionRate());

	}

}
