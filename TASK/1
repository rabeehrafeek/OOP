package RetailSystem;

public class InventoryItem {
    public String label;
    public double cost;
    public int stockCount;
    public String group;

  
    public InventoryItem(String itemName, double initialPrice, int initialQty, String itemType) {
        label = itemName;
        cost = initialPrice;
        stockCount = initialQty;
        group = itemType;
    }

    public void showStats() {
        System.out.println(">> ITEM REPORT <<");
        System.out.println("Name: " + label + " [" + group + "]");
        System.out.println("Price: " + cost + " USD");
        System.out.println("In Stock: " + stockCount);
        System.out.println("-----------------");
    }

    public double updatePrice(double offPercent) 
        double multiplier = 1 - (offPercent / 100);
        cost = cost * multiplier;
        return cost;
    }

    public int addStock(int incoming) {
        stockCount = stockCount + incoming;
        return stockCount;
    }

    public int processSale(int unitsToSell) 
        if (unitsToSell > stockCount) {
            System.out.println("FAILURE: Request for " + unitsToSell + " exceeds " + stockCount + " available.");
            return stockCount;
        }

        stockCount = stockCount - unitsToSell;
        System.out.println("SUCCESS: " + unitsToSell + " units of " + label + " sold.");
        return stockCount;
    }

    public static void main(String[] args) {
       
        InventoryItem itemA = new InventoryItem("Monitor", 350.00, 12, "Peripherals");
        InventoryItem itemB = new InventoryItem("Mechanical Keyboard", 120.00, 8, "Peripherals");
        InventoryItem itemC = new InventoryItem("Graphic Card", 700.00, 3, "Hardware");

        itemA.showStats();
        itemB.showStats();
        itemC.showStats();

        System.out.println("Running Clearance Sale...");
        itemA.updatePrice(20.0); 

    
        System.out.println("Receiving Shipment...");
        itemB.addStock(5); 

       
        System.out.println("Processing Customer Order...");
        itemC.processSale(10); 
    }
}
```
