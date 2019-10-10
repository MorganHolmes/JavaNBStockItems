package Warehouse;
public class Tester2
{
   public void main(){
       StockItems product1 = new StockItems("Baked Beans 415g", 65);
       product1.doDelivery(15);
       StockItems product2 = new StockItems("Eggs (Box Of 6)", 175);
       product2.doDelivery(10);
       StockItems product3 = new StockItems("Bread", 89);
       product3.doDelivery(7);
       
       //Methods following task
       product3.setPrice(99);
       product1.doDelivery(10);
       product2.doSale(3);
       System.out.println(product1.getStockInfo());
       System.out.println(product2.getStockInfo());
       System.out.println(product3.getStockInfo());   
    }
}
