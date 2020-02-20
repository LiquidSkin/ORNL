
public abstract class DwarfStar extends Star {
	private double pressure;
	private double fusionRate;

	public double getFusionRate() {
		return fusionRate;
	}

	public void setFusionRate(double fusionRate) {
		this.fusionRate = fusionRate;
	}

	public abstract double calculatePressure();

	public abstract void getDetails();

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

}
