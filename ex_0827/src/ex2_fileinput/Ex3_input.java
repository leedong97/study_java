package ex2_fileinput;

public class Ex3_input {
    


    public static void main(String[] args) {
        
        byte[] console = new byte[100];

        try{

            System.out.println("입력");
            System.in.read(console);//System.in - 표준스트림이라고 키보드에 있는것들 값을 받기위해 있는 스트림

            String res = new String(console); // console을 문자열로 재조립한것
            System.out.println(res.trim());

            
            System.in.close();// System.in- 이것도 스트림이라 닫아줘야한다
        }catch(Exception e){

        }
    }
}
