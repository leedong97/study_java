package ex07_work;

public class GraphSub_teacher {
    
    public void print(int[] arr){

        for(int i =0; i<arr.length;i++){

            System.out.print(i+"의 갯수 : ");

            for(int j=0; j<arr[i]; j++){
                System.out.print("#");
            }
            System.out.println(" "+arr[i]);

        }//outer

    











    }
}
