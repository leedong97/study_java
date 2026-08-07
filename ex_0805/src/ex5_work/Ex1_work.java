package ex5_work;

public class Ex1_work {
    public static void main(String[] args) {
        /*
        과수원이 있다.
        배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
        각각 5, 7, 5개 입니다.

        1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
        2.시간당 전체 과일의 평균 생산 갯수
         단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float
        */
        //  int pear = 5;
        //  int apple= 7;
        //  int orange= 5;
        
        //  int sum = pear+apple+ orange;
        //  //float average = (float)sum/24F;
        //  //float average = (float)sum/24;
        // float average = sum/24f;
        
        //  System.out.println("sum:"+ sum);
        //  System.out.println("average:"+ average);

        /*
        [난이도 어려운 문제]
        오늘은 과수원에서 생산되는 과일에 포도를 추가하여, 포도의 하루 생산량은 12개이다.
        1. 오늘 하루 동안 생산된 모든 과일(배, 사과, 오렌지, 포도)의 총 합을 구하시오.
        2. 각 과일이 전체 생산량에서 차지하는 비율(%)을 소수점 두 자리까지 구하여 출력하시오.
           (총합에 대한 각각의 과일의 비율을 float 타입으로 구하고, 예시) 배: 16.67%)
        */
        //    int pear = 5;
        //    int apple= 7;
        //    int orange= 5;
        //    int grape = 12;
           
        //    int sum = pear+apple+orange+grape;

        //    float ratep = (float)pear/sum;
        //    float ratea = (float)apple/sum;
        //    float rateo = (float)orange/sum;
        //    float rateg = (float)grape/sum;
        //    System.out.printf("%.2f%n",ratep);
        //    System.out.printf("%.2f%n",ratea);
        //    System.out.printf("%.2f%n",rateo);
        //    System.out.printf("%.2f%n",rateg);
        /*
        [난이도 매우 어려운 문제]
        한 달(30일) 동안 매일 같은 양의 과일(배, 사과, 오렌지, 포도)을 생산한다고 가정한다.
        이 때 과일별로 매주(7일마다) 1개씩 생산량이 감소(즉, 1~7일: 기존 생산량, 8~14일: -1, 15~21일: -2, 22~28일: -3, 29~30일: -4)한다.
        1. 30일 동안 생산된 전체 과일의 총합을 구하시오.
        2. 30일간 각 과일별로 생산된 총합을 구하여 출력하시오.
           (예를 들어, int pearTotal, appleTotal 등으로 각 과일의 총합 변수에 저장해서 출력)
        */
           int pear = 5;
           int apple= 7;
           int orange= 5;
           int grape = 12;
           int sum = pear+apple+orange+grape;
           
           
         

    }//main
    
}//class end
