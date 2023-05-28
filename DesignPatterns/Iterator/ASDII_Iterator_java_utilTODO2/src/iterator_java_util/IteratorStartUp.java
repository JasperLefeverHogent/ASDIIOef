package iterator_java_util;

import java.util.ArrayList;
import java.util.List;

import domein.CafeMenu;
import domein.DinerMenu;
import domein.Menu;
import domein.PancakeHouseMenu;
import domein.Waitress;

public class IteratorStartUp {
	public static void main(String args[]) {

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafe = new CafeMenu();

		List<Menu> menus = new ArrayList<>();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafe);

		Waitress waitress = new Waitress(menus);

		waitress.printMenu();

	}
}
