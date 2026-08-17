package ex_work;

import java.util.Random;

public class Ex09_work {
   public static void main(String[] args) {
      // 1~ 6 사이의 중복되지 않는 난수 6개를 출력하는
      // 문제 없으면 45개로 수정해라
      // 로또번호 생성기 만들기
      //
      // --------------------
      // 17 2 45 27 9 11

      int[] lotto = new int[6];

      outer: for (int i = 0; i < lotto.length;) {

         lotto[i] = new Random().nextInt(6) + 1;

         // 중복값 비교
         for (int j = 0; j < i; j++) {
            if (lotto[i] == lotto[j]) {
               continue outer;
            }

         } // inner
         System.out.print(lotto[i] + " ");
         i++;

      } // outer

      // Random random = new Random();

      // int[] lotto = new int[45];

      // out :for(int i =0; i< 45; i++){
      // int a= random.nextInt(45)+1;
      // for(int j=0; j<i; j++){
      // if(a==lotto[j]){
      // i--;
      // continue out;
      // }
      // }
      // lotto[i]=a;

      // }
      // for(int i =0; i<6;i++){
      // System.out.print(lotto[i]+" ");
      // }
   }
}