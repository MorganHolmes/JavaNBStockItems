package Warehouse;

import java.util.ArrayList;

public class StockList {
    private ArrayList<StockItems> shop;
    
    
    public StockList(){
        shop = new ArrayList<StockItems>();
          
    }
    
    public void addStockItem(StockItems i){
        shop.add(i);
    }
    
    public int noOfStockItem(){
        return 1;
    }
}
