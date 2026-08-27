package ex8_homework.teacher;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import ex_work.WorkSub;

public class WorkSubTeacher extends Thread {
    
    private List<String> arr;
    private String[] data;
    private Random rnd;

    @Override
    public void run() {
        
        while(true){

            int random = rnd.nextInt(data.length);
            arr.add(data[random]);
            System.out.println(arr);
            try{
                Thread.sleep(6000);
            }catch(Exception e){

            }
        }
    }
    public WorkSubTeacher(List<String> arr , String[] data){
        this.arr = arr;
        this.data = data;
        rnd = new Random();
    }


}
