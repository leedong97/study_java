package ex7_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1_work {
    
    public static void main(String[] args) {
        
        // ArrayList를 두 개 만들고 1~5 사이의 난수를 5개 추가해둔다(중복가능)
        // 두 개 리스트의 값을 비교하여 교집합을 출력
        //---------------------------------------
        // [5, 3, 5, 1, 5]
        // [2, 3, 1, 1, 3]
        // 교집합 : [3, 1]

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        Random rnd = new Random();
        for(int i =0; i<5; i++){
            int num = rnd.nextInt(5)+1;
            list1.add(num);
        }
        for(int i =0; i<5; i++){
            int num = rnd.nextInt(5)+1;
            list2.add(num);
        }
        
        System.out.println(list1);
        System.out.println(list2);
        List<Integer> list3 = new ArrayList<Integer>();

        for(int i= 0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i)==list2.get(j)){
                    list3.add(list1.get(i));                    
                }
            }            
        }
        System.out.println(list3);

        // 중복된값을 빼고 하는거보다 없는것을 정렬하는게 더편하다는 알고리즘이용
        // list.contain은 그 값이 있는지 확인가능
        List<Integer> list4 = new ArrayList<Integer>();
        for(int i=0; i< list3.size(); i++){
            for(int j =1; j<list3.size();j++){
              if(! list4.contains(list3.get(i))){
                list4.add(list3.get(i));
              }
            }
        }
        System.out.println(list4);


    }//main
}
