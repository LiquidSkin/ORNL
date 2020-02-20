
public abstract class DwarfStar extends Star {
	private int pressure;
	private double fusionRate;

	public double getFusionRate() {
		return fusionRate;
	}

	public void setFusionRate(double fusionRate) {
		this.fusionRate = fusionRate;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public abstract int calculatePressure();

	public abstract void getDetails();

}
