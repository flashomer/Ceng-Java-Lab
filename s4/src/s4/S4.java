package s4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import s4.*;

/**
 *
 * @author flashomer
 */


public class S4 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        
       int number,eveni=0,oddi=0,t=0;
       
       int[] arr_even = new int[50];
       int[] arr_odd = new int [50];
       int[] arr_all = new int [50];
       
       displayEven  ded = new displayEven();
       displayOdd   dod = new displayOdd();
       
       sumNumber    mN = new sumNumber();
       avNumber     avN = new avNumber();
       maxEven      maE = new maxEven();
       maxOdd       maO = new maxOdd();
       

       
        Scanner sn = new Scanner(System.in);
        System.out.println("---------------- ");
        number = sn.nextInt();
        
        while(number != -1){
               
            if(number % 2 == 0) {
                arr_even[eveni++] = number;
                
            } else {
              arr_odd[oddi++] = number;  
            }
            
            arr_all[t++] = number;
            
            number = sn.nextInt();
        }
        

        ded.displayEven(arr_even,eveni);
        dod.displayOdd(arr_odd,oddi);
        
        mN.sumNumber(arr_all,t);
        avN.avNumber(arr_all,t);
        maE.maxEven(arr_even,t);
        maO.maxOdd(arr_odd,t);
        
        
       
       
    }
    
}
