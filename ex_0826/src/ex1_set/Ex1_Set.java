package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex1_Set {
    
    public static void main(String[] args) {
        
        // collection :
        // 많은 수의 데이터를 그 사용 목적에 적합한 구조로 묶어서
        // 하나로 그룹화 한 객체
        // --------------
        // Set, Map, List

        // Set은 java.util 패키지의 인터페이스다.
        // 특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
        // 복잡한 코드없이 중복요소를 빠르게 제거할 수 있다.

        // Set인터페이스를 구현하고 있는 대표적인 자식클래스
        // HashSet : 정렬이 안됨
        // TreeSet : 오름차순 정렬을 기본 베이스로 가지고있다.
        int[] arr = {150,70,10,200};
        // 배열은 여기서 배열의 크기 길이를 늘리거나 줄이는게 불가능하다.

        Set<Integer> set = new HashSet<Integer>();
        // 인터페이스를 가지고 직접적으로 메모리할당 받을수는 없다. 
        // Set은  HashSet의 참조값을 가진다.
        set.add(150);
        set.add(70);
        set.add(10);
        set.add(200);

        // 중복된 값은 추가하지 않는다.
        set.add(10);

        // set의 모든 내용을 비운다.
        set.clear();
        
        
        System.out.println("set의 크기: "+ set.size());
        System.out.println(set);
        // 정렬은 참조값의 순서대로이며 참조값이 순차적이 아니라 값의 순서가 뒤바뀔수 있다.

        System.out.println("----------------------------");

        Set<Integer> set2 = new HashSet<Integer>();
        Random rnd = new Random();

        while(true){

            int r= rnd.nextInt(6)+1;
            set2.add(r);

            if(set2.size() ==6){
                break;
            }
            
        }//while
        System.out.println(set2);

        //set2를 배열로 변환
        Integer[] arr1 = set2.toArray(new Integer[0]);
        // set2가 가지고있는 많은 정보를 toArray(배열로만들고싶어)
        //new Integer[0]- 6개짜리를만들어서 복사해줄게!!
        // 6개는 지금 코드의 예시일뿐
        for(int i =0; i< arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }//for
        System.out.println();
        System.out.println("---------------------");

        int[] arr2 =new int[set2.size()];
        int i = 0;
        for(Integer num : set2){
            arr2[i++] = num;

        }
        
        for (int j = 0; j <arr2.length; j++){
            System.out.print(arr2[j]+ " ");
        }

    }//main
}
