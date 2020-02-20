import java.io.*;
import java.math.*;

public class Star {
	private String name;
	private String constellation;
	private int luminosity;
	private long temperature;
	private double flux;
	private double radius;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 0) {
			throw new IllegalArgumentException();
		}

		this.name = name;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		if (constellation == null || constellation.length() < 0) {
			throw new IllegalArgumentException();
		}
		this.constellation = constellation;
	}

	public int getLuminosity() {
		return luminosity;
	}

	public void setLuminosity(int luminosity) {
		this.luminosity = luminosity;
	}

	public long getTemperature() {
		return temperature;
	}

	public void setTemperature(long temperature) {
		this.temperature = temperature;
	}

	public double calculateFlux() {
		flux = luminosity / (4 * radius * radius * Math.PI * Math.PI);
		return flux;

	}
	public static void main(String[] args)
	{
		Star s1 = new Star();
		s1.setConstellation("Hydra");
		s1.setName("Sun");
		s1.setLuminosity(22);
		s1.setTemperature(2000);
		s1.setRadius(50000);
		System.out.println(s1.getName());
		System.out.println(s1.getConstellation());
		System.out.println(s1.getLuminosity());
		System.out.println(s1.getTemperature());
		System.out.println(s1.getRadius());
		System.out.println(s1.calculateFlux());
		
	}

}
