package ex1_copyarray;

public class Ex1_CopyArray {
    
    public static void main(String[] args) {
        
        //얕은 복사
        //arr1의 heap에 있는 위치값을 받는것이다. 객체이기 때문에
        // 배열은 객체라고 생각해야한다.
        // 얕은 복사는 복사받은 원본까지 값이 바뀐다.
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 100;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        
        //깊은 복사
        int[] arr3 = {1,2,3};
        int[] arr4 = new int[arr3.length];

        for(int i =0; i< arr3.length; i++){
            arr4[i] = arr3[i];
        }
        
        arr3[0] = 100;
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);










    }//main
}
