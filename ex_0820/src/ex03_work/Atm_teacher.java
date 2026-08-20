package ex03_work;

public class Atm_teacher {
    
    private int money;//잔액

    // 입금
    public void deposit(int money){
        System.out.println("입금성공");
        this.money += money;

    }
    //출금
    public void withdraw(int money){
        if(this.money-money <0){
            System.out.println("잔액부족");
        }else{
            System.out.println("출금성공");
            this.money -= money;
        }
    }

    //잔액확인
    public void balance(){
        System.out.println("잔액: "+this.money);
        // money가 아니라 this.money가 아닌이유가뭐지?

    }





}
