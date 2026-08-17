package work;

public class Ex01_work {

    public static void main(String[] args) {
        // 배열 arr에 담긴 모든값의 합과 평균 구하기
        // ----------------------------------
        // 총합: 119
        // 평균: 7.44

        int[][] arr = { {7,8,11,6},
                        {20,13,9,2,5},
                        {7,7,10},
                        {2,3,4,5} };
        int sum= 0;
        int a= 0;
        int cnt= 0;
        for(int i =0; i<arr.length; i++){
            
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];            
                cnt++;    
            }
            a += sum;
        }
         float avg = (float)sum/cnt;

         System.out.println("총합: "+ sum);
         System.out.printf("평균: %.2f", avg);
        

    }// main

}
