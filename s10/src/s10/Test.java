/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10;

import java.util.Scanner;

/**
 *
 * @author flashomer
 */
public class Test {
    private static int MAX_PRODUCT = 3;
    private static int MAX_CUSTOMER = 3;
    private static int productCount;
    private static int customerCount;
    static Product[] productList = new Product[MAX_PRODUCT];
    static Customer[] customerList = new Customer[MAX_CUSTOMER];
   
    public static void main(String[] args) {
        
        
        
        customerList[0] = new Customer("ali", "123");
        customerList[1] = new Customer("veli", "veli234");
        customerList[2] = new Customer("can", "345can");

        productList[0] = new Product("Computer", 2358.5);
        productList[1] = new Product("Phone", 1230.55);
        productList[2] = new Product("Television", 3569.2);
        
        Scanner input1 = new Scanner(System.in);
        Scanner input = new Scanner(System.in); 
        
        Basket bas = new Basket();
        
        int as = 1;
        
        while(loginEnter() != true) {
            loginEnter();
        }

        
    while (as == 1) {
 
        
        switch (menuNum()){
            case 1 :
                producList();
        
        System.out.println("Enter a product to ADD your Basket: ");
        int pnum = input1.nextInt();
        
        System.out.println("Enter the amount: ");
        int emounnum = input1.nextInt();
        
        System.out.println("Press (Y) to continue, (N) to Logout");
        String chose = input.nextLine();
        
        
        if(chose.equals("Y") || chose.equals("y")){
            System.out.println("Secim : "+(pnum));
            bas.addToBasket(productList[--pnum], emounnum);
            System.out.println("Eklendi! "+pnum);

        } else {
            System.out.println("GOOD BYE!!!");
            as = 0;
            break;
        }     
        
                break;
            case 2 :
        
        System.out.println("Enter a product to DELETE from your Basket: ");
        String chosesPro = input.nextLine();
  
        System.out.println("Press (Y) to continue, (N) to Logout");
        String chosey = input.nextLine();
        
        if(chosey.equals("Y") || chosey.equals("y")){
            bas.removeFromBasket(chosesPro);
            System.out.println("Silindi!");

        } else {
            System.out.println("GOOD BYE!!!");
            as = 0;
            break;
        }         
                
                
                break;
            case 3 :
                bas.showBasketandSum();
                
                break;
                
              default:
        }   
    }   
               
    }
    
    private static boolean loginControl(String n, String p){
      
        for(int i=0; i<MAX_CUSTOMER; i++){
            if(n.equals(customerList[i].getUsername()) && p.equals(customerList[i].getPassword())){
                return true;                
            }
        }
        return false;
    }
    
    private static boolean loginEnter(){
      
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String lname = input1.nextLine();
        
        System.out.println("Enter password: ");
        String lpass = input2.nextLine();
        
        if(loginControl(lname,lpass) ){
            System.out.println("Welcome ali");
            return true;
            
        } else {
            System.out.println("Password is not correct !!!");
        }
        return false;    
    }
    
    private static int menuNum(){
        
        System.out.println("\nMENU\n" +
            "1. Add Product to MyBasket\n" +
            "2. Remove Product from MyBasket\n" +
            "3. Show MyBasket and Sum");
        
        Scanner input1 = new Scanner(System.in);
        int menuNum = input1.nextInt();
        int a = 0;
        
        while (a==0) {
            if(menuNum<4 && menuNum>0){
                a = 1;
            }
        }
  
        return menuNum;
        
    }
    
    private static void producList(){
        System.out.println("\nPRODUCT LIST\n**************\n");
        for(int i= 0; i<MAX_PRODUCT; i++){
            System.out.println((i+1)+". "+productList[i].getName()+" "+productList[i].getPrice() );
        }

    }

}
