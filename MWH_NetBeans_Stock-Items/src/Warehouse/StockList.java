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
    
    public int noOfStockItems(){
        //The size method gets the number of items in the Array List.
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
        for(int i = 0; i < noOfStockItems();i++){
            StockItems temp = shop.get(i);
            allItems += temp.getStockInfo();
        }
        return allItems;
    }
    
    public StockItems getItem(int i){
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
    
    public void addStockItem(String desc, double price, int d, int m, int y){
        StockItems temp = new StockItems(desc,price,d,m,y);
        addStockItem(temp);
    }
}
