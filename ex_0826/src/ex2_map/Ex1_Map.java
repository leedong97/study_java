package ex2_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
    
    public static void main(String[] args) {
        //  key   ,  value
        Map<Integer,Character> map= new HashMap<>(); 
        map.put(10, 'A');
        // map구조는 put으로 저장한다
        map.put(11,'C');
        map.put(12,'A');
        map.put(10,'D');
        // key값이 중복되면 마지막에 들어간 value값으로 갱신해서 출력하게 된다.
        System.out.println("size: "+map.size());
        
        char res=map.get(10);
        System.out.println(res);
        
        System.out.println("map: "+map);

        if( map.containsKey(10)){
            System.out.println("map에 key가 10인 데이터가 있음");
        }
        
        if(map.containsValue('A')){
            System.out.println("map에 A가 저장되어 있음");
        }










    }//main
}
