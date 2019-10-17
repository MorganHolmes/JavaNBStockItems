/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

/**
 *
 * @author Morgan
 */
public class TestMap {
    public TestMap(){
        tester();
    }
    
    public void tester(){
        StockMap testerArray  = new StockMap();
        StockItems product1 = new StockItems("Bugatti",10.0);
        StockItems product2 = new StockItems("Porsche",20.0);
        testerArray.addStockItem(new Integer(1),product1);
        testerArray.addStockItem(new Integer(2),product2);
        testerArray.addStockItem("Lego", 10.0, 10, 10, 1998, new Integer(3));
        System.out.println(testerArray.getAllItems());
    }
}
