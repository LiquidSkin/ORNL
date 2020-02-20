
public class SuperGiant extends Star {
	private float surfaceGravity;

	public float getSurfaceGravity() {
		return surfaceGravity;
	}

	public void setSurfaceGravity(float surfaceGravity) {
		this.surfaceGravity = surfaceGravity;
	}
	public static void main(String[] args)
	{
		SuperGiant sg1 = new SuperGiant();
		sg1.setName("Betelgeuse");
		sg1.setConstellation("Ursula Major");
		sg1.setLuminosity(100);
		sg1.setRadius(4000000);
		sg1.setTemperature(10000);
		sg1.setSurfaceGravity(4);
		System.out.println(sg1.getSurfaceGravity());
		System.out.println(sg1.calculateFlux());
	}

}
