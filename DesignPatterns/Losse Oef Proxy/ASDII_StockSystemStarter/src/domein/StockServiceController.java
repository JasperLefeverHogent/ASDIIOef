package domein;

public class StockServiceController {

    private StockService service = new StockService();

    public String performActions(String[] args) {
        return switch (args[0]) {
            case "updateQuantity" -> updateQuantity(args[1], Integer.parseInt(args[2]));
            case "createProduct"-> createProduct(args[1], Integer.parseInt(args[2]));
            case "shipProduct" -> shipProduct(args[1]);
            case "showStock" -> showStock();
            default -> "Unrecognized action" + args[0];
        };
    }

    private String createProduct(String productName, int quantity) {
        return service.insert(productName, quantity);
    }

    private String updateQuantity(String productName, 
    		int newQuantity) {
        return service.update(productName, newQuantity);
    }

   
    private String shipProduct(String productName) {
        return service.ship(productName);
    }

    private String showStock() {
        return String.format("DATABASE : stockstatus%n%s%n", service.productenView());
    }
}
