package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_input {
    
    public static void main(String[] args) {
        
        // C:/myFile/work.txt의 내용을 읽어서
        // 숫자들의 합만 출력하기
        // ------------------------
        // 결과: 5

        String path = "C:/myFile/work.txt";
        File f= new File(path);
        FileInputStream fis =null;

        try{
            fis = new FileInputStream(f);
            int code =0;
            int sum =0;// 정수들의 총 합 계산을 위한 변수

            while((code= fis.read())!= -1){

                String s = String.valueOf((char)code);
                //String에서 제공해주는 메서드인 String.ValueOf(a)=>a의값이 어떤것이든
                //파라미터를 String으로 바꿔준다
                try{
                    sum += Integer.parseInt(s);

                }catch(Exception e){

                }finally{

                    try{
                        if(fis != null){
                            fis.close();
                        }
                    }catch(Exception e){

                    }
                }

            }//while
            System.out.println("결과: "+ sum);
        }catch(Exception e){

        }


       
    }//main
}
