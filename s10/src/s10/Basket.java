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
public class Basket {
   private int MAX_PRODUCT = 3;
   private BasketItem[] basket = new BasketItem[MAX_PRODUCT];
   private int productNum;
   private double basketSum;
   
   public boolean addToBasket(Product p, int amount){
       System.out.println("Okunan: "+p.getName()+ " - ProNum: "+productNum);
       /*
       for(int i = 0; i<productNum; i++){
           if(p.getId() == basket[i].getProd().getId()){
               basketSum += amount*p.getPrice();
               basket[i].setAmount(basket[i].getAmount()+amount);
               return true;
               
           }
       }*/

       if(productNum < MAX_PRODUCT){
           basket[productNum++] = new BasketItem(p, amount);
           basketSum += amount*p.getPrice();
           return true;
       }
       
       return false;
   }
   
   public boolean removeFromBasket(String name){
       
       for(int i = 0; i<productNum; i++){
            if(name.equals(basket[i].getProd().getName())){
                basketSum -= basket[i].getAmount()*basket[i].getProd().getPrice();
                basket[i] = basket[--productNum];
                return true;
            }
       }
       
       
           
       return false;
   }
   
   public void showBasketandSum(){
       
        for(int i = 0; i<productNum; i++){
            System.out.println(basket[i].getAmount()+" "+basket[i].getProd().getName()+" "+basket[i].getAmount()*basket[i].getProd().getPrice());
            
        }
        
        System.out.println("Total:"+basketSum);
   }
   
   
    
}
