/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

/**
 *
 * @author flashomer
 */
public class avNumber {
    
        public static void avNumber(int tnumber[],int n) {
            double sum;
            int tnum=0;
        for(int i=0; i<n; i++){
            tnum += tnumber[i];
        }
        sum =  tnum / n;
        
            System.out.println("The average of numbers is "+sum);
        }
    
}
