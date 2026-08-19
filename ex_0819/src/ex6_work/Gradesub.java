package ex6_work;

public class Gradesub {
    

    public int result(int price, String grade){
       
        if(grade.equalsIgnoreCase("vip")){
            return price*10/100;
        }else if(grade.equalsIgnoreCase("gold")){
            return price*5/100;
        }else if(grade.equalsIgnoreCase("silver")){
            return price*3/100;
        }else{
            System.out.println("회원등급이 올바르지 않습니다");
            return 0;
            // 반환형이 int이기 때문에 그냥 리턴값에
            // 반환값을 정수로 하나 넣어주면 된다.
        }



        
    }
}
