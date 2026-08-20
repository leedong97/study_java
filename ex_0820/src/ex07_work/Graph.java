package ex07_work;

import java.util.Random;

public class Graph {

    public static void main(String[] args) {

        // 0~9사이의 난수를 100개 발생시키고
        // 각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오
        // -------------------------------------
        // 0의 갯수 : ############ 12
        // 1의 갯수 : ####### 7
        // ..
        // 9의 갯수 : ########## 10
        Random r = new Random();
    
        int[] random = new int[100];
        // 배열의 선언 방법 다시 한번 공부해라.
        for (int i = 0; i < 100; i++) {
            random[i] = r.nextInt(10);
        }
        GraphSub sub = new GraphSub();
        sub.compare(random);
    }
}
