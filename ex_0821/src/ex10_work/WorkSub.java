package ex10_work;

public class WorkSub {
    // 씨바 마방진 떡벽이네 ㅠㅠ ㅈㄴ어렵다  흐윽 ㅠㅠ
    
    private int num = 1;
    private int y=0;// 행
    private int x=0;// 열
    private int[][] arr;



    public int[][] square(int size){

        x= size/2;
        arr = new int[size][size];


        while(num<=size*size ){

            arr[y][x] = num;

            if(num %size ==0)
                y++;
            else{
                y--;
                x++;
            }

            if( y<0)
                y = size-1;
            if(x == size)
                x=0;

            num++;


        }//while

            return arr;


    }//square
}
