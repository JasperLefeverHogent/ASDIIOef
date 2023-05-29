package mealapp;

import domein.Builder;
import domein.ItalianBuilder;
import domein.JapanBuilder;
import domein.MenuDirector;

public class MealApp {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		new MealApp();
	}

	public MealApp() {

		Builder j = new JapanBuilder();
		Builder i = new ItalianBuilder();
		MenuDirector italian = new MenuDirector(i);
		MenuDirector japan = new MenuDirector(j);
		italian.build();
		japan.build();
		System.out.printf("menu is: %s%n", italian.get());

		System.out.printf("menu is: %s%n", japan.get());
	}

}
