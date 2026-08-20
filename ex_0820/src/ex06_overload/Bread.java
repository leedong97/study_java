package ex06_overload;

public class Bread {
    String type;
    int num;

    // 메서드 1
    public void makeBread(){
        System.out.println("빵을 만들었습니다");
        System.out.println("--------------");
    }

    // 메서드 2
    public void makeBread(int num){
      
        for(int i=0; i<num;i++){
        System.out.println("빵을 만들었습니다");
        }
        System.out.println("요청하신 "+num+"개의 빵을 만들었습니다");
        System.out.println("--------------");
    }

    // 메서드 3
    public void makeBread(String type, int num){
        for(int i=0; i<num;i++){
            System.out.println(type+"빵을 만들었습니다");            
            }
            System.out.println("요청하신 "+num+"개의 "+"type"+"빵을 만들었습니다");
            System.out.println("--------------");
    }   


}
