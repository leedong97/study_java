package ex8_homework.test;

import java.util.List;
import java.util.Random;

public class WorkThread implements Runnable {
    List<String> list;
    String[] data;
    boolean isCheck = true;
    Random rnd = new Random();

    public void setCheck(boolean isCheck) {
        this.isCheck = isCheck;
    }
    
    public WorkThread(String[] data, List<String> list){
        this.list = list;
        this.data = data;

    }

    @Override
    public void run() {
        
        while(isCheck ==true){
            try{
                Thread.sleep(6000);
                int rndnum = rnd.nextInt(6);
                list.add(data[rndnum]);
                System.out.println();
                System.out.println(list);
               
            }catch(Exception e){
                e.printStackTrace();
            }
        }
       
      
    }
}
