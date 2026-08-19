package ex2_set_get;

public class Person2 {
    
    private String name;
    private int age;

    public void setInfo(String name, int age){
        // getter/setter 처럼 완전 직관적인게 아니면
        // 파라미터를 더 직관적으로 만들어줘야한다.
        this.name = name;
        this.age = age;
        // this : 현재 클래스 자신
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }















}
