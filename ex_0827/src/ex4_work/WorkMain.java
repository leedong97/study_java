package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class WorkMain {
    
    public static void main(String[] args) {
        
        //C:/myFile/work3.txt에서
        // 사용자가 입력받은 값의 출현 빈도를 출력
        // --------------------------
        // 입력: 홍
        // 홍의 출현 횟수 : 4

        String path = "C:/myFile/work3.txt";
        // 경로에 대한 값을 지정
        File f = new File(path);
        // 해당경로의 파일을 받을 객체를 생성
        byte[] console = new byte[(int)f.length()];
        // File 객체의 length()로 파일 크기를 구해서, 
        // 그 크기만큼 byte 배열을 만들어 놓았다
        // long형이라 int형으로 바꿔서 배열로 받앗음
        FileInputStream fis =null;
        // FileInputStream 참조변수 fis를 선언하고 null로 초기화
        // 아직 만든것은 안디ㅏ

        try{
            Scanner sc= new Scanner(System.in);
            fis = new FileInputStream(f);
            // fis라는 객체로 파일의 정보를 스트림을 통해 받는다.
            // f가 가리키는 파일을 읽기 위한 입력 스트림 생성
            fis.read(console);
            // 받았으니까 이제 읽는다.
            // 파일의 데이터를 읽어서 byte[] console 배열에 저장
            
           String str = new String(console);
           //String[] str = new String[console.length];

           System.out.print("입력: ");
           String word = sc.next();          
           int count = 0;

           for(int i =0; i<str.length(); i++){
                        //length에서 console은 byte형이라 꼬인다
                if(str.charAt(i)== word.charAt(0)){
                    //charAt은 char형이라서 
                    //뒤에도 형변환을 한번 해줘야한다.
                    count++;
                }
           }

            System.out.println(word+"의 출현 횟수 :"+count);
        }catch(Exception e){

        }

     
    }//main
}
