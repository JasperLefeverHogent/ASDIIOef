package domein;

public class MacCompFact implements ComponentFactory {

	public Button createButton() {
		return new MacButton();
	}

	public Label createLabel() {
		return new MacLabel();
	}
}
