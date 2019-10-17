
package Warehouse;

import java.util.HashMap;

/**
 *
 * @author Morgan
 */
public class StockMap {
    private HashMap<Integer, StockItems> shop;
    
    
    public StockMap(){
        shop = new HashMap<Integer, StockItems>();
          
    }
    
    public void addStockItem(Integer i, StockItems x){
        shop.put(i,x);
    }
    
    public int noOfStockItems(){
        //The size method gets the number of items in the Array List.
        System.out.println(shop.size());
        return shop.size();
    }
    
    public void removeItem(int x){
        if(x >= 0 && x < noOfStockItems()){
            //Uses the remove method to remove the value sorted at index X
            shop.remove(x);
        }else{
            System.out.println("Invalid Value Has Been Entered");
        }
    }
    
    public String getAllItems(){
        String allItems = "";
        
        for(Integer key : shop.keySet()){
            StockItems temp = shop.get(key);
            allItems += temp.getStockInfo();
        }
        return allItems;
    }
    
    public StockItems getItem(Integer i){
        return shop.get(i);
    }
   
    
    public StockItems getItemByStockNo(int stockNo){
        for(int i = 0; i < noOfStockItems();i++){
            StockItems temp = shop.get(i);
            if(temp.getStockNo() == stockNo){
                return temp;
            }
        }
        return null; 
      
    }
    
    public StockItems getItem(String desc){
        for(int i = 0; i < noOfStockItems();i++){
            StockItems temp = shop.get(i);
            if(temp.getDescription() == desc){
                return temp;
            }
        }
        return null;   
    }
    
    public void addStockItem(String desc, double price, int d, int m, int y,Integer i){
        StockItems temp = new StockItems(desc,price,d,m,y);
        addStockItem(i, temp);
    }
}
