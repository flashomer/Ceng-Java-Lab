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
public class BasketItem {
    private Product prod;
    private int amount;
    
    public BasketItem(Product p, int a){
        this.amount = a;
        this.prod = p;
    }

    public int getAmount() {
        return amount;
    }

    public Product getProd() {
        return prod;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
    
    
    
   
}
