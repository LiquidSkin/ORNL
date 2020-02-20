import java.util.*;
import java.io.*;

public class BlackHole {
	public String name;
	public double mass;
	public String constellation;
	public String variableType;

	BlackHole() {
		name = "MilkyWayBlackHole";
		mass = 200000;
		constellation = "Ursula";
		variableType = "M";
	}

	BlackHole(String name, double mass, String constellation, String variableType) {
		this.name = name;
		this.mass = mass;
		this.constellation = constellation;
		this.variableType = variableType;
	}

	BlackHole(String name) {
		this.name = name;
		mass = 150000;
		constellation = "Canis";
		variableType = "S";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((constellation == null) ? 0 : constellation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mass);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((variableType == null) ? 0 : variableType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlackHole other = (BlackHole) obj;
		if (constellation == null) {
			if (other.constellation != null)
				return false;
		} else if (!constellation.equals(other.constellation))
			return false;
		if (Double.doubleToLongBits(mass) != Double.doubleToLongBits(other.mass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (variableType == null) {
			if (other.variableType != null)
				return false;
		} else if (!variableType.equals(other.variableType))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Set<BlackHole> set = new HashSet<BlackHole>();
		set.add(new BlackHole());
		set.add(new BlackHole("M333311", 20000, "Virgo", "M"));
		set.add(new BlackHole("M333311", 20000, "Virgo", "M"));
		for (BlackHole b : set) {
			System.out.println("The Name of the BlackHole is" + " " + b.name);
			System.out.println("The mass of the BlackHole is" + " " + b.mass);
			System.out.println("The constellation of the BlackHole is" + " " + b.constellation);
			System.out.println("The variableType of the BlackHole is" + " " + b.variableType);
		}
		System.out.println("The size of the Hashset is" + " " + set.size());

	}
}
