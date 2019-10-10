package Warehouse;
public class Tester
{
   public static void main(String[] args){
       StockItems test = new StockItems("Baked Beans 415g",65,10,10,2019);
       //System.out.println("Done");
       System.out.println(test.getStockInfo());
    }
}
