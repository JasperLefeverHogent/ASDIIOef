package domein;

public class WinCompFact implements ComponentFactory {

	public Button createButton() {
		return new WinButton();
	}

	public Label createLabel() {
		return new WinLabel();
	}
}
