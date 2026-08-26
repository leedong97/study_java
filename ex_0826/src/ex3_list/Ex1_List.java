package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(); 
        //List는 전부 ArrayList로 받는다
        // list는 다른 컬렉션과 다르게 인덱스가 있다
        // list는 인덱스에 있는 값을 받아오려면 list.get(index번호)로 하면된다.
        list.add(100);
        list.add(100);
        list.add(50);
        list.add(1, 60);
        //add로 인덱스에 직접 값을 채워넣으면 원래 배열의 인덱스가 하나씩 밀린다
        list.set(0,90);
        //set로 값을 직접 넣으면 값이 변한다.
        // list.get(i)으로 값넣은걸 확인가능하다.
        list.remove(2);
        //remove로 값을 직접 삭제하면 뒤에 인덱스들은 하나씩 앞으로 온다.
        
        if(list.contains(50)){// list.contains로 값이 있는지 확인한다
            System.out.println("list에 50이 있다");
        }
        System.out.println("size : "+list.size());
        System.out.println(list);
        System.out.println("2번 index값 :"+list.get(2));

        list.clear();
        System.out.println("size: "+list.size());
        // 모든값을 초기화


    }// main
}
