package ex2_constructor;

public class Pokemon {
    

    private String name;
    private int hp;
    private String type;

    public Pokemon(String name, String type){
        // 메서드처럼 생겻지만 메서드는 아니고 생성자이다.
        this.name= name;
        this.type= type;
        hp=100;
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // public void setType(String type) {
    //     this.type = type;
    // }

    
    public void info(){
        System.out.println("이름: "+ name);
        System.out.println("타입: "+type);
        System.out.println("체력: "+hp);
        System.out.println("-------------------------");
    }
}
