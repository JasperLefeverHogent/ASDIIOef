package domein;

public abstract class Graphic {

	public abstract void draw();
	
	public void add(Graphic g) {
		throw new UnsupportedOperationException();
	}
}
