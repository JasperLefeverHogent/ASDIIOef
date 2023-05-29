package domein;

public abstract class Builder {
	
	private Menu menu;

	public Menu getMenu() {
		return menu;
	}
	
	public abstract void addDrink();

	public abstract void addMainCourse();

	public abstract void addSide();


	public void createNewMenu() {
		this.menu = new Menu();
	}


}
