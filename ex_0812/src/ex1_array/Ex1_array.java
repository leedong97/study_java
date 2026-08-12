package ex1_array;

public class Ex1_array {
    
    public static void main(String[] args) {
        
        // 배열은 '같은 자료형끼리 모아둔 하나의 묶음'
        // 효율적인 자료관리를 위해 반드시 필요하다

        int su1 = 100;
        int su2 = 200;
        int su3 = 300;
        int su4 = 400;

        // 1) 배열 선언
        int[] arr;
        // []이 1개이면 1차원 배열이다.

        // 2) 배열 생성
        arr = new int[4];
        // 메모리 영역(jvm영역에서의)
        // stack
        /*
            그동안썻던 int su1 =100; 등 전부 stack에 들어간다

        */

        // heap
        /*
            new 생성자를 쓰는순간 그동안 썻던 변수에서 heap에 정보가 올라간다
            arr = new int[4];
            -> heap에 4개의 자리가 필요한 1차원 배열을 만들게요~ 라는 뜻이다
            존재하지 않은 index에 접근할 수 없다.
        */
       //3) 배열 초기화
       arr[0]= 100;
       arr[1]= 200;
       arr[2]= 300;
       arr[3]= 400;
    //    arr[4]= 500;
       // [4] 는 현재 존재하지 않아서 값이 안들어간다 오류다.

       //배열의 모든 내용을 출력
        for(int i =0; i<arr.length;i++){

            System.out.println(arr[i]);

        }// for

    }//main
}
