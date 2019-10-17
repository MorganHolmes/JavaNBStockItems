package Warehouse;

import java.util.*;

public class Sales {
    
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);
       System.out.println("Enter Product Name?");
       String proName = myObj.nextLine();
       StockItems product1 = new StockItems(proName, 65);
       System.out.println(product1.getStockInfo());
       TestList a = new TestList();
       TestMap b = new TestMap();
    }
    
}
