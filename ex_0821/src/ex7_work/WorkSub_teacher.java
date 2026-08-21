package ex7_work;

public class WorkSub_teacher {
    
    public int getBigger(int[] arr){

        int max= 0;

        for(int i =1; i< arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }

        }// for
        return max;
    }
}
