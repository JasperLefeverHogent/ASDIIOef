package domein;

import java.util.ArrayList;
import java.util.List;

public class Screen {

	private ComponentFactory factory;
	private List<Label> labels = new ArrayList<>();
	private List<Button> buttons = new ArrayList<>();

	public Screen(ComponentFactory fact) {
		this.factory = fact;
	}


    public void addButton() {
        buttons.add(factory.createButton());
    }

    public void addLabel() {
        labels.add(factory.createLabel());
    }

    public void viewComponents() {
    	labels.forEach(Label::show);
    	buttons.forEach(Button::show);
    }

}
