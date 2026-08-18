package work;

import java.util.Random;
//랜덤 클래스를 사용하려고 임포트를 넣어둔것입니다. 이게 없으면 밑에
// 랜덤 클래스 를 사용할때 랜덤이라는기능을 사용할수 없습니다
// 기본적으로 우리가 사용하는 것들은 java.lang에 있기때문에 따로 임포트가 필요합니다
import java.util.Scanner;
// 위에 랜덤이랑 똑같이 scanner 또한 java.lang에는 없고 java.utill에만 있기 때문에
// scanner클래스를 사용하려면 임포트를해줘야합니다.

public class Ex1_baseball {
    // 클ㄹ스 명입니다.

    public static void main(String[] args) {
        // 메인 메서드라는 뜻입니다.
        Scanner sc = new Scanner(System.in);
        // 입력받은 값을 사용하기위해서 scanner라는 클래스를 생성
        // new 생성자를 통해 객체를 생성
        // sc라는 변수에 값을 넣었습니다.
        int[] com = new int[3];
        // com이라는 변수명에 int형 자료형이자 배열의 길이가 3인
        // 배열을 생성했습니다.
        int[] user = new int[3];
        // user라는 변수명에 int형 자료형이자 배열의 길이가 3인
        // 배열을 생성햇습니다.

        outer: for (int i = 0; i < com.length;) {
            // 이 큰 for문 내의 코드의 의미는 로또번호 뽑듯이
            // 앞의 숫자랑 뒤의 숫자가 겹치지않은 난수 1~9까지의 숫자를
            // 배열의 길이만큼 뽑아내기 위한 반복문이다.
            // for문이라는 반복문을 사용했고 outer라는 label개념을 사용했으며
            // 조건식에는 com의 배열의 길이만큼 반복한다는것을 사용하였고
            // 증감식은 for문 바깥에 뺐습니다.
            // 증감식을 바깥으로 뺀 이유는 아래 2중 for문 내에서 continue를
            // 사용햇을때 라벨되어잇는 조건문의 증감식으로 넘어가는데
            // 증감식이 적용되지 않은상태로 다시 outer이라는 label이 되어있는
            // for문을 한번더 사용하기 위해서입니다.

            com[i] = new Random().nextInt(9) + 1;
            // com이라는 배열에 i라는 인덱스값을 배열의 요소에 1부터 시작하고
            // 최소값이 1인 9까지의 수중에서의 난수를 생성하겠습니다라는 뜻입니다.

            // 중복값 비교
            for (int j = 0; j < i; j++) {
                // 2중 포문의 inner for문이고 j가 i 보다 작은값까지만 반복하는
                // 증가하는 반복문을 작성하겟다는 뜻입니다.
                if (com[i] == com[j]) {
                    // if 조건문으로써 com배열의 인덱스값이 i인 요소의 값과
                    // com배여르이 인덱스값이 j인 요소의 값이 같을때
                    // 이 반복문을 실행합니다 라는 뜻입니다.
                    continue outer;
                    // 난수를 뽑을때 앞의 숫자랑 뒤에 숫자가 겹치지 않길
                    // 원하는데 여기서 같은 조건이 나왔을경우
                    // outer이라고 라벨이 되어있는 for문으로 이동하고
                    // break가 아닌 continue이기때문에 증감식으로 이동
                    // 증감식이 없다면 조건식으로 이동한뒤 조건문을 한번더
                    // 돌린다는 뜻입니다.
                }

            } // inner
            i++;
            // for문의 증감식을 여기로 뺏고 그 이유는
            // continue에서 증감식의 영향을 받지 않기위해
            // outer for문이 끝날때 증감식을 적용하여 계산합니다.

        } // outer

        System.out.println("정답: " + com[0] + com[1] + com[2]);
        // 정답값을 출력하기 위해서 썼으며 인덱스값이 0,1,2인값을 합침으로써
        // 겉보기에는 하나의 숫자로 보입니다.

        int cnt = 0;
        // 몇회 시행햇는지를 알고싶은데 그걸 넣을 변수가 없어서
        // 여기에서 지금 변수 선언및 0으로 초기화를 하고있는것이다.

        while (true) {
            //while문이 true일때 무한으로 도는 반복문입니다
            cnt++;
            // while문이 한번 시행될대마다 입력하는 행위의 반복이 일어나기때문에
            // cnt++로 카운팅을 하는중입니다.
            System.out.print("입력(예:123) : ");
            // ()안의 값을 출력하겠습니다 라는 뜻입니다.
            int number = sc.nextInt();
            // int 자료형의 number라는 변수에 Scanner를 이용해서
            // 입력받은 값을 초기화 하겠습니다라는 뜻입니다.
            user[0] = number / 100;
            //user라는 배열의 0이라는 인덱스의 값을 number값에서 100을 나눈 몫을
            // 값으로 하겠습니다 라는뜻
            user[1] = number / 10 % 10;
            // user라는 배열의 인덱스 1이 가진 값을 number값에서 10을 나눈 몫에
            // 10을 나눈 나머지의 값을 넣겠습니다라는 뜻
            user[2] = number % 10;
            // user라는 배열의 인덱스 2가 가진 값을 number값에서 10을 나눈 
            // 나머지 값을 넣겠습니다 라는뜻입니다.

            int strike = 0;
            // int형 자료형인 strike라는 변수에 0이라는 값을 초기화 
            int ball = 0;
            // int 자료형이 ball이라는 변수에 0이라는 값을 초기화
            for (int i = 0; i < user.length; i++) {
                // 이 for 문은 지금 strike와 ball을 확인하기 위해 돌리는 반복문이다
                //  i는0부터 증가해서 user라는 배열의 길이만큼 반복하겟다는 뜻이다.
                for (int j = 0; j < user.length; j++) {
                // 2중 for 으로써 이것도 user라는 배열의 길이만큼 반복한다
                
                    if (i == j) {
                        // i의 값과 j의 값이 동일할때 조건문을 실행한다
                        if (com[i] == user[j])
                        // com배열의 인덱스 i의 값과 user 배열의 인덱스j의 값이 같을때 조건문을 실행한다
                            strike++;
                        // 위의 조건문이 실행될때 strike변수의 값을 1씩 증가시킨다.
                    
                    } else {
                    // if문의 조건이 아닌 모든 경우를 else 조건문으로 쓸수있다.
                    // 해당 else문은 if문의 맨 마지막에 한번만 사용가능하다.
                        if (com[i] == user[j])
                        // com배열의 인덱스 i의 값과 user 배열의 인덱스j의 값이 같을때 조건문을 실행한다,
                            ball++;
                        // 위의 조건문이 참일때 ball을 1씩 증가시킨다.
                    }
                }

            } // for

            // 정답처리
            if (strike == 3) {
            // strike값이 3일때 위의 조건문을 실행한다.
            // 3strike면 3개의 난수가 모두 같기 때문에 정답인 경우이다.
                System.out.println("정답!! -" + com[0] + com[1] + com[2]);
                // ()안의 값을 출력하겟다.
                System.out.println(cnt + "회 클리어");
                // ()안의 값을 출력하겟다.
                break;
                // 해당 조건문 실행시 break는 해당 조건문을 감싸고있는 것중 가장 가까운
                // 반복문을 종료하고 그것은 while문이다. 
            } else {

                if (strike > 0 || ball > 0) {
                // strike가 0보다 크거나(or) ball의 값이 0보다 큰 경우 이 조건문을 실행한다.
                // 해당 경우에는 1가지 이상의 값이 같기 때문에 strike와 ball을 모두 표현해야한다.
                    System.out.printf("%d Strike %d\n", strike, ball);
                    // () 안의 값을 출력한다.
                } else {
                    // if문의 조건식 이외의 모든경우엔 이 조건식을 실행한다.
                    System.out.println("Out!!");
                    // ()안의 값을 출력한다.
                }
            }
            System.out.println("------------------------");

        } // while

    }// main
}
