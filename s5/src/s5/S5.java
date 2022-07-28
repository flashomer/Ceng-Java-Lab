/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s5;
import java.util.Scanner;

/**
 *
 * @author flashomer
 */
public class S5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 0;
        int n1 = 0;
        int n2 = 0;
        double res = 0;
        String  choose;
        
        Scanner sn = new Scanner(System.in);
        
        while(number != 4){
            
         System.out.println(" MENU\n" +"-----------\n"+"1. Rectangle\n"+"2. Square\n"+"3. Circle\n"+"4. Exit \n");
         
         System.out.println("Enter your choice: ");
         number = sn.nextInt(); 
         
         if(number == 1) { 
            System.out.println("Which operation do you want to calculate\n" +"For Area (A), For Perimeter (P): ");
            choose = sn.next();
            
            
            System.out.println("Enter two sides of rectangle: ");
            n1 = sn.nextInt();
            n2 = sn.nextInt();
            
            if(choose == "A"){
                
                res = n1* n2;
                
            } else {
              res = (n1+n2)*2;  
            }
            
             System.out.println("Area of Rectangle is "+res);
            
         } else if(number == 2) { 
            System.out.println("Which operation do you want to calculate\n" +"For Area (A), For Perimeter (P): ");
            choose = sn.next();
            
            
            System.out.println("Enter two sides of Square: ");
            n1 = sn.nextInt();
            
            if(choose == "A"){
                
                res = n1* n1;
                
            } else {
              res = (n1)*4;  
            }
            
             System.out.println("Area of Square is "+res);
            
         } else if(number == 3) { 
            System.out.println("Which operation do you want to calculate\n" +"For Area (A), For Perimeter (P): ");
            choose = sn.next();
            
            
            System.out.println("Enter radius of a circle: ");
            n1 = sn.nextInt();
            
            if(choose == "A"){
                
                res = 3.14*(n1* n1);
                
            } else {
              res = (n1)*2*3.14;  
            }
            
             System.out.println("Area of circle is "+res);
            
         }
         
         

        }
        
        
        
    }
    
}
