package ex6_fileoutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex2_BufOutput {
    

    public static void main(String[] args) {
        
        String path = "C:/myFile/bufOutput.txt";
        File f= new File(path);

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try{
            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);

            String msg = "안녕하세요 반가워요 abcd";

            bos.write(msg.getBytes());
            //close가 안되면 완료된 결과물을 갱신시키지 못해서
            // 생성된 파일에 정보가 안들어가있다.

            bos.flush();
            // buffer라는 스트림중에 출력하는 스트림들은 flush를 다 가지고있다
            // 기록하자 하는 값을 물리적으로 저장하는 메서드
            // 원래는 close를 할때 호출이 되는것인데 이걸 미리 한번 호출해서
            // 제대로 안 닫혀도 그냥 값은 나오게하는것이다.
        }catch(Exception e){

        }finally{
            try{
                
                if( bos!= null){
                    bos.close();
                }
                if( fos!= null){
                    fos.close();
                }



            }catch(Exception e){
                e.printStackTrace();
            }
        }



    }//main
}
