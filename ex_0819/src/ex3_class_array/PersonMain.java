package ex3_class_array;

public class PersonMain {
    
    public static void main(String[] args) {
        
        Person[] p1 = new Person[2];
        
        // 공식처럼 그냥 외워라
        // 클래스를 배열로 만들었다면
        // 반드시, 무조건 각 index의 객체화를 해줘야 한다.
        // 내가 만든 모든 클래스를 배열로써 객체 생성을 하려고하면 
        // 한번에 Person[] p1= new Person(); 가 절대 안된다
        for(int i =0; i<p1.length; i++){
            p1[i]= new Person();
        }
        p1[0].setName("홍길동");
        p1[0].setAge(20);

        p1[1].setName("김길동");
        p1[1].setAge(25);

        // 홍길동 / 20
        // 김길동 / 25
        for(int i =0; i<p1.length; i++){
            System.out.println("//"+p1[i].getName()+"/"+p1[i].getAge());
        }
  
    

        
    }//main
}
