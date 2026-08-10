package operator_ex;

import java.util.Scanner;

public class Ex1_operator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
       
        
        Ex1_operator p = new Ex1_operator();
        p.practice1(sc);
        p.practice2(sc);
        p.practice3(sc);
        // p.practice4(sc);
        // p.practice5(sc);
        // p.practice6(sc);
        // p.practice7(sc);
        // p.practice8(sc);
        // p.practice9(sc);
        // p.practice10(sc);
        // p.practice11(sc);
        // sc.close();
    }//main메서드
           
 
   public void practice1(Scanner sc){
    // Scanner sc= new Scanner(System.in);
    /*
            메소드 명 : public void practice1(){}
        키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
        ex.
        정수 : -9
        양수가 아니다
            */
    System.out.print("정수: ");
    int a = sc.nextInt();

    if(a>=0){
        System.out.println("양수다");
    }else{
        System.out.println("양수가 아니다");
    }
  
   }//practice1 클래스

//    메소드 명 : public void practice2(){}
// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
// 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
// ex.
// 정수 : -9
// 음수다
   public void practice2(Scanner sc){
    // Scanner sc= new Scanner(System.in);
    System.out.print("정수: ");
    int a = sc.nextInt();
    

    if(a>0){
        System.out.println("양수다");
    }else if(a==0){
        System.out.println("0이다");
    }else{
        System.out.println("음수다");
    }
    

   }//practice2 클래스

   public void practice3(Scanner sc){
    // Scanner sc= new Scanner(System.in);
    System.out.print("정수: ");
    int a =sc.nextInt();

    if((a/2)==0){
        System.out.println("짝수다");
    }else{
        System.out.println("홀수다");
    }

    sc.close();
   }//practice3 클래스

   public void practice4(Scanner sc){

    System.out.print("인원 수: ");
    int a = sc.nextInt();

    System.out.print("사탕 개수: ");
    int b = sc.nextInt();

    int c = b/a;
    System.out.println("1인당 사탕 개수: "+c);

    int d = b-(a*c);
    System.out.println("남은 사탕 개수: "+d);
    
   }//practice4 클래스
   
   public void practice5(Scanner sc){
    System.out.print("이름 : ");
    String name = sc.next();

    System.out.print("학년(숫자만): ");
    int grade = sc.nextInt();

    System.out.print("반(숫자만): ");
    int gc = sc.nextInt();

    System.out.print("번호(숫자만): ");
    int num = sc.nextInt();

    System.out.print("성별(M/F): ");
    String sex= sc.next();
   
    if(sex.equals("M")){
       sex="남학생";
    }else if( sex.equals("F")){
        sex="여학생";
    }
  
    System.out.print("성적(소수점 아래 둘째자리까지): ");
    double score= sc.nextDouble();

    System.out.print(grade+"학년 "+gc+"반 "+num+"번 "+name+" "+sex+"의 성적은 "+score+"이다.");



   }//practice5 클래스
   public void practice6(Scanner sc){

    System.out.print("나이: ");
    int age= sc.nextInt();

    if(age<=13){
        System.out.print("어린이");
    }else if(13<age && age<=19){
        System.out.print("청소년");
    }else{
        System.out.print("성인");
    }
}
  public void practice7(Scanner sc){

    System.out.print("국어: ");
    int korean = sc.nextInt();
    System.out.print("영어: ");
    int english = sc.nextInt();
    System.out.print("수학: ");
    int math = sc.nextInt();
    System.out.print("");
    
    int sum = korean+english+math;
    double average= (sum)/3.0;
    System.out.println("합계: "+sum);
    System.out.println("평균: "+average);
    if(korean>=40&& english>=40&& math>=40&&average>=60){
        System.out.print("합격");
    }else{
        System.out.print("불합격");
    }
  }//practice7
  public void practice8(Scanner sc){

    System.out.print("주민번호를 입력하세요(-포함): ");
    char s = sc.next().charAt(7);
    if(s=='1'){
      System.out.println("남자");
    }else if( s=='2'){
        System.out.println("여자");
    }
  }//practice8
  
  public void practice9(Scanner sc){

    System.out.print("정수1: ");
    int num1 = sc.nextInt();

    System.out.print("정수2: ");
    int num2 = sc.nextInt();

    System.out.print("입력: ");
    int num3 = sc.nextInt();

    if(num3<=num1 || num3>num2){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
  }// practice9

  public void practice10(Scanner sc){

    System.out.print("입력1:");
    int a = sc.nextInt();
    System.out.print("입력2: ");
    int b = sc.nextInt();
    System.out.print("입력3: ");
    int c= sc.nextInt();

    if(a==b&&b==c&&c==a){
        System.out.println("true");        
    }else{
        System.out.println("false");
    }

  }//practice10
  public void practice11(Scanner sc){
    System.out.print("A사원의 연봉: ");
    int a = sc.nextInt();

    System.out.print("B사원의 연봉: ");
    int b= sc.nextInt();

    System.out.print("C사원의 연봉: ");
    int c= sc.nextInt();

    double a1=1.4*a;
    double b1= b;
    double c1= 1.15*c;
    System.out.println("A사원 연봉/연봉+a :"+a+"/"+a1);
    if(a1>=3000){
        System.out.println("3000 이상");
    }else{
        System.out.println("3000미만");
    }

    System.out.println("B사원 연봉/연봉+a :"+b+"/"+b1);
    if(b1>=3000){
        System.out.println("3000이상");
    }else{
        System.out.println("3000미만");
    }
   
    System.out.println("C사원 연봉/연봉+a: "+c+"/"+c1);
    if(c1>=3000){
        System.out.println("3000이상");
    }else{
        System.out.println("3000미만");
    }



  }// practice11
}//class
