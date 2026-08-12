package ex_work;

public class Ex03_work {
    
    public static void main(String[] args) {
        
        
        
        // 배열 arr에 담긴 값 중 가장 큰 값을 출력
        // ----------------------------
        // 가장 큰 값 : 19

        int[] arr = {4,13,7,19,1,15};
        int res =0;
        for(int i=1; i<arr.length;i++){
          
            if(res<arr[i]){
                res=arr[i];
            }
        }
        System.out.print(res);



    }//main
}
