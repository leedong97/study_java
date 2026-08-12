package ex_work;

public class Ex07_work {
    public static void main(String[] args) {
        
        // 배열 arr을 오름차순으로 출력
        // ---------------------------
        // 11 7 9 20 15 3 
        // 3 7 9 11 15 20
        int[] arr= {11,7,9,20,15,3};
        int up= 0;
        int down= 0;
        // 내림차순 코드
        for(int i = 0; i <6; i++){
            for(int j = i; j<6; j++){
                if(arr[i] < arr[j]){
                    down = arr[i];
                    arr[i]= arr[j];
                    arr[j]= down;                  
                }// if
            }//inner for
            System.out.print(arr[i]+" ");
        }//outer for

        System.out.println();
        // 오름차순 코드
        for(int i= 0; i<6; i++){
            for(int j = i; j<6; j++){
                if(arr[i]> arr[j]){
                    
                    up = arr[i];
                    arr[i]= arr[j];
                    arr[j]= up;
                    
                }//if
            }//for inner
            System.out.print(arr[i]+" ");
        }//for outer 












    }//main
}
