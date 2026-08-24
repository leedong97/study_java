package ex3_override;

public class CalMain {
    

    public static void main(String[] args) {
        

        
        CalPlus cp = new CalPlus();
        int a=cp.getResult(10,20); // -> 30
        System.out.println(a);
    
        CalMinus cm = new CalMinus(); 
        int b=cm.getResult(15,10);// -> 5
        System.out.println(b);
    }//main

}
