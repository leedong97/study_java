package ex7_work;

public class WorkMain {
    
    public static void main(String[] args) {
        
        // 가장 큰 값 : 20
        int[] arr = {1, 11, 7, 20, 13,15};

    //     WorkSub_teacher subteacher = new WorkSub_teacher();

    //    int res=subteacher.getBigger(arr);

    //    System.out.println("가장큰값: "+ res);

        WorkSub ws = new WorkSub();
        //int num =0;

        //int res =ws.big(arr);
        
        System.out.println("가장큰값: "+ws.big(arr));

    }
}
