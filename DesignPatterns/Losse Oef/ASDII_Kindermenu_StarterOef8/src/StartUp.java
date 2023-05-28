import domein.KinderMenu;

public class StartUp {

	public static void main(String[] args) {
		new StartUp().run();
	}
	
	public void run()
	{
		//Correcte kindermenu's:
		toonKinderMenu("cheeseBurger", "cola", "ijsje", "tol");

		toonKinderMenu("cheeseBurger", "limonade", "koek", "bal");

		//Foutieve kindermenu's:
		toonKinderMenu("", "cola", "ijsje", "tol");

		toonKinderMenu("cheeseBurger", "cola", null, "tol");
		
	}

	private void toonKinderMenu(String hamburger, String drank, String dessert, String geschenk)
	{
		try
		{
//TODO
			KinderMenu menu = null;
			System.out.println(menu);	        
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("fout menu");
		}

	}
}