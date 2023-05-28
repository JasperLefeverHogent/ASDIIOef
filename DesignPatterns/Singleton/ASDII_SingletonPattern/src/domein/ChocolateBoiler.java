package domein;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    
 //Singleton en lazy loading
//    private static ChocolateBoiler instance;
//
//    public static ChocolateBoiler getInstance() {
//        if (instance == null) {
//            instance = new ChocolateBoiler();
//        }
//        return instance;
//    }
  
  //Meteen aanmaken van instantie
 private static final ChocolateBoiler instance = new ChocolateBoiler(); 

    public static ChocolateBoiler getInstance() {
        return instance;
    }
    
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // vul de boiler met een mengsel van melk en chocolade
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // voer de verwarmde melk en chocolade af
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {     // verwarm de inhoud
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
