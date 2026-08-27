package ex8_homework.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    
    public static void main(String[] args) {
        String[] data = { "apple", "banna", "orange", "grape", "straberry", "pineapple" };
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        boolean isCheck = true;
        WorkThread wt = new WorkThread(data,list);
        Thread tr = new Thread(wt);
        tr.start();
        int rndnum = rnd.nextInt(6);
        list.add(data[rndnum]);

        while(isCheck==true){

           
            System.out.println(list);
            System.out.print(">>");
            String input = sc.next();

            for(int i =0; i<list.size(); i++){
                if(list.get(i).equalsIgnoreCase(input)){
                    list.remove(i);
                }
            }
            if(list.size()==0){
                System.out.println("clear!!");
                wt.setCheck(false);
                isCheck=false;
              
            }




        }






























    }//main
}
