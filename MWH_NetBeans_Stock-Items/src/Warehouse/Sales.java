package Warehouse;

import java.util.*;

public class Sales {
    
 
    public static void main(String[] args) {
       String enteredValue = " ";
       while(!"Exit".equals(enteredValue)){
        System.out.println("********************\n Morgan Holmes Stock Items Application\n********************");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Press 1 - Create New Product");
        System.out.println("Press 2 - Create New Hash Map");
        System.out.println("Press 3 - Create New Test List");
        System.out.println("Exit To Close The Application");
        enteredValue = (myObj.nextLine());
        if("1".equals(enteredValue)){
            System.out.println("Enter Product Name?");
            String proName = myObj.nextLine();
            System.out.println("Enter Product Price?");
            String price = myObj.nextLine();
            StockItems product1 = new StockItems(proName, Integer.parseInt(price));
            System.out.println(product1.getStockInfo());
            
        }
        if("2".equals(enteredValue)){
            TestMap b = new TestMap();
        }
        if("3".equals(enteredValue)){
            TestList a = new TestList();
        }
         if(enteredValue == "Exit"){
            break;
        }
       }
      
    }
    
}
