package domein;

public class ItalianBuilder extends Builder {

	public void addDrink() {
		getMenu().setDrink("French Wine");
	}

	public void addMainCourse() {
		getMenu().setMainCourse("Baguette");
	}

	public void addSide() {
		getMenu().setSide("french Toast");
	}
}
