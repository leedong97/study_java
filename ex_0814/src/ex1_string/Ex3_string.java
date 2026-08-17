package ex1_string;

public class Ex3_string {
    public static void main(String[] args) {
        
        String id ="801122-334455";
        //substring(0, 2)는 0번부터 2번까지가 아니라, 0번부터 2번 직전까지를 뜻한다. 
        // 헷갈리지 말자

        if( id.trim().length() != 13 ||
            id.trim().charAt(6) !='-'){
                System.out.println("주민번호가 잘못됐어요");

        }else{
            String year = id.substring(0,2);
            String month = id.substring(2,4);
            String day = id.substring(4,6);
            char gender = id.charAt(7);

            System.out.printf(
                "당신은 %s년 %s월 %s일에 태어난 ",year,month,day);

            if(gender =='1'|| gender =='3'){
                System.out.println("남자입니다");
            }else{
                System.out.println("여자입니다");
            }
        }
    }
    
}
