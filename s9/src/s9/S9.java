
package s9;


public class S9 {


    public static void main(String[] args) {
        
        NewClass a = new NewClass(500, "Ahmet");
        NewClass m = new NewClass(350, "Mehmet");
        System.out.println(a.toString());
        System.out.println(m.toString());
        
        a.withdraw(250);
        m.Deposit(250);
        
        System.out.println(a.toString());
        System.out.println(m.toString());
        
       if(m.withdraw(700) != 0){
        a.Deposit(700);   
       }
        
        
        
        System.out.println(a.toString());
        System.out.println(m.toString());
        
        
        
    }
    
}
