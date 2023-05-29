package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Diagram extends Graphic {

	private List<Graphic> graphics = new ArrayList<>();

	public void draw() {
		for (Graphic graphic : graphics) {
			graphic.draw();
		}
	}

	@Override
	public void add(Graphic g) {
		this.graphics.add(g);
	}

	public void remove(Graphic g) {
		this.graphics.remove(g);
	}

	public List<Graphic> getChildren() {
		return Collections.unmodifiableList(graphics);
	}
}
