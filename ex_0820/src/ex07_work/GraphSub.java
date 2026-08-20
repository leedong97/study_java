package ex07_work;

import java.util.Arrays;

public class GraphSub {
    

    

    public void compare(int[] random ){
        int res1 =0;
        int res2 =0;
        int res3 =0;
        System.out.println(Arrays.toString(random));
        // random이라는 배열의 각 인덱스의 값을 한번에 출력하는 문법이다

        for(int i =0; i<10;i++){
            int count=0; 
            
            for(int j =0; j<random.length; j++){
               if(random[j]==i){                   
                count++;
                res1=count;     
                }
            }//for inner
            System.out.print(i+"의 갯수: ");
                for(int k=0; k<res1;k++){
                    System.out.print("#");
                }
                System.out.println(" "+res1);            
               res2= res1;
               res3 += res1;
               res1=0;
               
        }// for outer
        System.out.println("총합: "+ res3);
    }
}

