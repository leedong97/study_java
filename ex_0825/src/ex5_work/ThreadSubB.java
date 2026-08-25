package ex5_work;

public class ThreadSubB extends Thread {
    
    int[] arr;
    public ThreadSubB(int[] arr){
        this.arr= arr;
    }
    @Override
    public void run() {
        int sum= arr[0];
        for(int i=1; i<arr.length; i++){
            sum *= arr[i];
        }
        System.out.println("곱:" +sum);
    }
}
