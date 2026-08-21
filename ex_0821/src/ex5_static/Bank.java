package ex5_static;

public class Bank {

    private String point;
    private String tel;
    static float interest= 10f;
    // static 메모리에서의 값을 heap에서 참조하는데
    // 하나의 목적지로만 데이터가 간다.

    public Bank(String point , String tel){
        this.point = point;
        this.tel = tel;

    }

    public void info(){
        System.out.println("지점:" + point);
        System.out.println("전화 : "+ tel);
        System.out.println("이자율: "+interest+"%");
        System.out.println("-----------------");
    }
    
}