package ex7_generic;

public class GenTest<T> {
                //<T>가 제너릭타입이라는것이다,


    // 제네릭 프로그래밍
    // 일반적인 형태의 코드를 작성하고 이 코드를 다양한 타입의 객체에 대해서
    // 재사용이 가능한 구조로 만들어 둔 객체지향 기법

    T value;

    
    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    
}
