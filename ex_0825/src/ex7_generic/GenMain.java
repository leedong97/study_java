package ex7_generic;

public class GenMain {
    
    public static void main(String[] args) {
        
        GenTest<String> g1 = new GenTest<String>();
        // g1의 제너릭 타입은 string이 된다.
        g1.setValue("안녕");
        String res = g1.getValue();

        System.out.println(res);

        GenTest<Integer> g2 = new GenTest<Integer>();
        g2.setValue(123);
        int res2 = g2.getValue();

        System.out.println(res2);

     }//main
}
