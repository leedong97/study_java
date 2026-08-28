package ex3_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class WorkMain {
    
    public static void main(String[] args) {
        
        // 1 ~ 45 사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        // ------------------------------

        // Set : 중복값을 허용하지 않는 자바의 Interface
        // TreeSet : 중복을 허용하지않으면서 오름차순 정렬
        Random rnd = new Random();

        Set<Integer> set = new TreeSet<Integer>();

        while(set.size()<6){

            set.add(rnd.nextInt(45)+1);
        }//while
        
        System.out.println(set);

        // set에 담긴 내용을 정수배열에 복사
        Integer[] arr = set.toArray(new Integer[0]);
        //set.toArray() set을 배열로 만든다는것
        //new Integer[0] => 0인 배열을 갖는게 아니라 set이 가지고있는만큼 배열로 만든다는뜻

        for(int num: arr){
            //정확한 뜻 공부하자..
            // 개선된 for문 헷갈림..
            System.out.print(num+" ");
        }

        // List<Integer> list = new ArrayList<Integer>();
        // Random rnd= new Random();
        // list.add(rnd.nextInt(6)+1);
        // outer: for(int i= 0; i<6;i++){            
        //     for(int j =1; j<6; ){
        //         if(list.get(i).equals(rnd.nextInt(6)+1)){
        //             continue ;
        //         }else{
                    
        //         }
        //         j++;
        //     }
            
        // }//for
        // System.out.println(list);

    }//main
}
