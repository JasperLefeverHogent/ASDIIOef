import domein.KinderMenu;

public class StartUp {

	public static void main(String[] args) {
		new StartUp().run();
	}
	
	public void run()
	{
		//Maak een kindermenu met (deze volgorde behouden) 
     /*"cheeseBurger"
        "cola"
        "ijsje"  (=dessert)
        "tol"    (=geschenk)
        */
		KinderMenu menu1 = null;
               
		//Maak een kindermenu met (deze volgorde behouden)
		/* "koek"   (=dessert)
           "bal"    (=geschenk)
           "cheeseBurger"
           "limonade"
		 */
        KinderMenu menu2 = null;
               
        System.out.println(menu1);
		
		System.out.println(menu2);		
	}

}
