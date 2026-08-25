package ex1_set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<Integer>();
        //TreeSet은 기본적으로 오름차순 정렬의 특성을 가지고있다.
        Random rnd = new Random();
       
        while(ts.size()<6){

            int r = rnd.nextInt(45) + 1;
            ts.add(r);


        }
        System.out.println(ts);
        System.out.println(ts.subSet(10,30));
        System.out.println("-------------------------------");

        Set<String> set = new TreeSet<String>();
        set.add("홍길동");
        set.add("강길순");
        set.add("고봉민");
        System.out.println(set);
    }//main
}
