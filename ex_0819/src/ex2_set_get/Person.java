package ex2_set_get;

public class Person {
    // 어느정도의 보안성을 가지고
    // 접근제한자를 private를 걸고
    // 그상태에서 값을 주고 갖고오기위해 getter,setter 개념을 
    // 만들어냇다.
    private String gender;

    public void setGender(String s){
        //gender라는 값을 셋팅한다
        // setter는 void반환타입을 쓴다
        gender = s;

    }


    public String getGender(){
        //gender라는 값을 반환한다
        // 여기서 파라미터가 없는이유는 그냥 여기 있는값을
        // 돌려주면 되기 때문이다.
        return gender;
    }


    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    private int age;
    public void setAge(int a){
        age=a;
    }
    
    public int getAge(){
        return age;
    }









}
