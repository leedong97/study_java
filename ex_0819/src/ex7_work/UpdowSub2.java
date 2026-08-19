package ex7_work;

public class UpdowSub2 {
    
    public int result2(int num1,int random,int count){
        
        if(num1>random){
            System.out.println("up");
          
            return 0;
        }else if(num1<random){
            System.out.println("down");
           
            return 1;
        }else {
            
            System.out.print(count+"회만에 정답입니다");            
            return 2;
        }

    }
}
