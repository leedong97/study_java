package ex7_work;

public class WorkSub {

    public int big(int[] arr) {
       int a = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i];
            }

        }

        return a;
    }

}
