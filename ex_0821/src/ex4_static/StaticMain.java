package ex4_static;

public class StaticMain {
    
    int n;
    static String str;

    public void test1(){
        n = 10;
        str = "안녕";

    }

    public static int test2(int num){
        // static 메서드에서는 
        // 일반 변수의 참조가 불가능하다.
        //n = 10;
        str = "안녕";

       num = 100;

        return num;
        
        // static 전역변수는 불러올수는있다.
        // static 메서드 내에서
        // static 변수를 정의할수가 없다.
        // static int num2 = 200;
        
    }

    public static void main(String[] args) {
        int a=0;
        int res = StaticMain.test2(a);
        System.out.println(res);
        
    }



}
