package ex_work;

import java.util.Scanner;

public class Ex2_work {
    /*
     * String[][] actor =[{"[송강호]","박쥐","괴물","관상"},
     *                    {"[조인성]","모가디슈","호프"},
      *                   {"[이병헌"],"레드","광해","놈놈놈"}]
      * 
      * 검색 : 조인성
      * [조인성]
      * 모가디슈
      * 호프
      * 
      *검색 : aaaa
      * 해당 배우의 정보가 없습니다.
     */
    public void actor(){
        String[][] actor ={{"[송강호]","박쥐","괴물","관상"},
                         {"[조인성]","모가디슈","호프"},
                        {"[이병헌]","레드","광해","놈놈놈"}};
        System.out.print("검색: ");
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        int count = 0;

        for(int i = 0; i<actor.length; i++){
            if(("[" +a+ "]").equals(actor[i][0])){
                for(int j =0; j<3; j++){
                    System.out.println(actor[i][j]);
                }
            }else{
                count ++;
                if(count == actor.length){
                    System.out.println("해당 배우의 정보가 없습니다.");
                }
                
                
            }
        }



    }


















}//main
