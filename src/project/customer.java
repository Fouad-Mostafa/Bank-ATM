
package project;

public class customer {
    
    public String card;
    public int PIN;
    public static int Balance;
    
    public customer()
    {
        
    }
  
    public customer (String s,int p){
    
        s = card;
        p = PIN;
        Balance=0;
    }
    
    public static int getBalance() {
       return Balance;
    }
    
    
}
