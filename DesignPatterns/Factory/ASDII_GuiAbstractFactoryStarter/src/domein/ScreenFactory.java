package domein;

public class ScreenFactory {

	public static Screen createScreen(String type) {

		return new Screen(switch (type) {
			case "win" -> new WinCompFact();
			case "mac" -> new MacCompFact();
			default -> throw new IllegalArgumentException();
		});
	}
	
}
