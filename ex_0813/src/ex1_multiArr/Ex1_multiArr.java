package ex1_multiArr;


public class Ex1_multiArr {
    public static void main(String[] args) {
        
        int[][] test = new int [2][3];
        test[0][0] = 100;
        test[0][1]= 200;
        test[0][2]= 300;

        test[1][0]= 400;
        test[1][1]= 500;
        test[1][2] =600;

        //test[2][0]= 700; - 이건 오류코드다 없는 방이다
        
        for(int i =0; i< test.length; i++){
            //  test.length ==> 큰방의 배열 갯수


            for(int j = 0; j<test[i].length; j++){
                // 이중 배열 에서부터는 정사각형 배열이 안되는경우가 있어서 1차원 i 일때,2차원 배열의 수(1차원 i의 인덱스의 갯수의) 길이로 해야한다.
                System.out.print(test[i][j]+" ");

            }//inner

            System.out.println();

        }//outer

















    }   //main 
}
