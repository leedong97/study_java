package ex8_homework.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkTeacher {
    
    public static void main(String[] args) {
        
        String[] data = { "apple", "banna", "orange", "grape", "straberry", "pineapple" };
        List<String> arr = new ArrayList<String>();

        WorkSubTeacher ws = new WorkSubTeacher(arr, data);
        ws.setDaemon(true);
        // daemon쓰레드는 메인이 죽음 쓰레드도 죽는것이다.
        ws.start();
        // 쓰레드가 준비할 시간이 조금 있는데 그동안 while이 먼저 돈다
        // 그래서 바로돌리면 사이즈가 0이라고 나오는것이다.
        Scanner sc = new Scanner(System.in);


        while (true) {
            
            if(arr.size()==0){
                System.out.println("클리어!!");
                break;
            }
            
            System.out.println(">>");
            String in = sc.next();

            // 사용자가 입력한 단어와 arr에 담긴 값을 비교
            for(int i =0; i< arr.size(); i++){
                if(in.equals(arr.get(i))){
                    arr.remove(i);
                    break;
                }

            }//for
        }
        





    }
}
