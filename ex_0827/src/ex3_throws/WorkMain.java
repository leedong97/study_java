package ex3_throws;

public class WorkMain {

    public static void main(String[] args) {

        //Sub1과 Sub2에서 던져준(throws) 예외에 대한 처리를
        // 현재 클레스에서 묶어서 해결한다.
        WorkSub1 w1 = new WorkSub1();
        WorkSub2 w2 = new WorkSub2();

        try {
            w1.result();
            w2.result();
        } catch (Exception e) {

        }
    }// main
}
