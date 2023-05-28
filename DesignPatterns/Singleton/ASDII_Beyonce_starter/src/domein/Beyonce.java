package domein;

public class Beyonce 
{
	private int aantalKeerGezongen;
	
	public Beyonce() {
	}

	public void zingEenLied() {
		++aantalKeerGezongen;
		System.out.println("Ik zong "+ aantalKeerGezongen + " keer");
	}
}
