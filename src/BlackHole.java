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

	public static void main(String[] args) {
		Set<BlackHole> set = new HashSet<BlackHole>();
		set.add(new BlackHole());
		set.add(new BlackHole("M44771",800000,"Virgo","N"));
		set.add(new BlackHole("M44771",800000,"Virgo","N"));
		for(BlackHole b: set)
		{
			System.out.println(b.name);
			System.out.println(b.constellation);
			System.out.println(b.mass);
			System.out.println(b.variableType);
			
		}
		

	}
}
