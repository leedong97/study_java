package ex1_copyarray;

public class ArrMain {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};

        ArrSub as = new ArrSub();
        as.param(array);
        // 보낼 sub랑 이름이 달라도된다. 그냥 형태만 같으면 된다.
        // 이 경우는 얕은 복사라 주소를 보낸다. 그래서 복사값이 변하면
        // 원본값도 변하는것이다. 왜냐하면 주소를 같이 공유하기 때문에
        // 하나의 값만 변해도 다같이 변한다.
        // 데이터가 오고 가는 순서는 as.param으로 메서드를 호출하면
        // 파라미터인 int[] arr 저기서 arr이 array의 주소값을 공유할게요
        // 하고 난뒤 메서드를 실행한 후 값을 넘기는것이다.
        System.out.println("main: "+ array[0]);



    }
}
