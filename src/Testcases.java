import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class Testcases {

	@Test
	public void BlackHoleTest() {
		Scanner sc = new Scanner(System.in);
		BlackHole bt = new BlackHole();
		assertEquals(bt.name, "MilkyWayBlackHole");
		assertEquals(bt.constellation, "Ursula");
	}

	@Test
	public void BlackHoleTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of your blackhole");
		String name = sc.nextLine();
		BlackHole bt = new BlackHole(name);
		assertEquals(bt.name, name);
	}

	@Test
	public void WhiteDwarfTest() {
		Scanner sc = new Scanner(System.in);
		WhiteDwarf w = new WhiteDwarf();
		System.out.println("Enter the radius of the white dwarf");
		int radius = sc.nextInt();
		w.setRadius(radius);
		assertEquals(w.calculatePressure(), w.getRadius() * w.getRadius());
		// assertEquals(w.calculatePressure(),w.getRadius() * w.getRadius() *
		// w.getRadius());
	}

	@Test
	public void StarTest() {
		Scanner sc = new Scanner(System.in);
		Star s = new Star();
		System.out.println("Enter the lumosity of the star");
		int l = sc.nextInt();
		s.setLuminosity(l);
		System.out.println("Enter the radius of the star");
		int r = sc.nextInt();
		s.setRadius(r);
		assertEquals((int) s.calculateFlux(), (int) (l / (4 * r * r * Math.PI * Math.PI)));

	}

}
