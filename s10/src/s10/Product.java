/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10;

/**
 *
 * @author flashomer
 */
public class Product {
    private int id;
    private static int lastId;
    private String name;
    private double price;
    
    
    public Product(String name_, double price_){
      this.name = name_;
      this.price = price_;
      
    }
    
    public static int getLastId() {
        return lastId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setLastId(int lastId) {
        Product.lastId = lastId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
    
}
