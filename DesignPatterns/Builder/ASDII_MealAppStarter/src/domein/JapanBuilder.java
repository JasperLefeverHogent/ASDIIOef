package domein;

public class JapanBuilder extends Builder {

	public void addDrink() {
		getMenu().setDrink("Soy milk");
	}

	public void addMainCourse() {
		getMenu().setMainCourse("Dumplings");
	}

	public void addSide() {
		getMenu().setSide("sushi");
	}
}
