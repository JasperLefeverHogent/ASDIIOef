package domein;
//zonder lazy loading
//public class Singleton {
//
//    private static final Singleton uniqueInstance 
//            = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return uniqueInstance;        
//    }
//}

//Met lazy loading
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
