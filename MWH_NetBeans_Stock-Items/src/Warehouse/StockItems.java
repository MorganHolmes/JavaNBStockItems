package Warehouse;

public class StockItems
{
    //Private variables
    private String description;
    private int level;
    private double price;
    private Date sellByDate;
    private int stockNo;
    
    //Constructor
    public StockItems(String desc, double price){
        level = 0;
        description = desc;
        this.price = price;
        sellByDate = new Date(99,99,99);
    }
    
    public StockItems(String desc, double price, int d, int m, int y){
        level = 0;
        description = desc;
        this.price = price;
        sellByDate = new Date(d,m,y);
    }
    
     public StockItems(String desc, double price, int d, int m, int y,int stockNo){
        level = 0;
        description = desc;
        this.price = price;
        sellByDate = new Date(d,m,y);
        this.stockNo = stockNo;
    }
   
    //Mutators
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setSellByDate(int d, int m, int y){
        sellByDate.setDate(d,m,y);
    }
    
    public void doDelivery(int amount){
        level += amount;
    }
    
    public void doSale(int amount){
        if(level < amount){
            System.out.print("Not Enough Stock To Complete Sale");
        }else{
            level -= amount;
        }
    }
    
    //Accessors
    public int getStockLevel(){
        return level;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getStockNo(){
        return stockNo;
    }
   
    
    public String getStockInfo(){
        return "*** Stock Report ***\n" + "Item: " + getDescription()
        + "\nPrice: " + getPrice() + "\nStock Level: " + getStockLevel() +
         "\nSell By Date: " + sellByDate.getAsString() +
        "\n********************";
    }
    }
    

