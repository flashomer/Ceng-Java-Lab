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
public class maxOdd {
    public static void maxOdd(int tnumber[], int n) {
            int i,a;
            a = tnumber[0];
        for(i=0; i<n; i++){
            if(a < tnumber[i]) {
                a = tnumber[i];
            }
        }
            System.out.println("The maximum of the odd numbers: "+a);
    }
}
