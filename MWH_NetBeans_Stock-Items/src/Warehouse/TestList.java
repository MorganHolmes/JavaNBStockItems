
package Warehouse;

public class TestList {
    public TestList(){
        tester();
    }
    
    public void tester(){
        StockList testerArray  = new StockList();
        StockItems product1 = new StockItems("Ferrari",10.0);
        StockItems product2 = new StockItems("Lambo",20.0);
        testerArray.addStockItem(product1);
        testerArray.addStockItem(product2);
        testerArray.addStockItem("BMW", 10.0, 10, 10, 1998);
        System.out.println(testerArray.getAllItems());
    }
}
