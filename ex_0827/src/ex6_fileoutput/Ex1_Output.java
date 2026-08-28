package ex6_fileoutput;

import java.io.File;
import java.io.FileOutputStream;

public class Ex1_Output {
    
    public static void main(String[] args) {
        
        File f= new File("C:/myFile/fileOutput.txt");
        FileOutputStream fos =null;

        try{

            fos = new FileOutputStream(f, true);

            String msg = "수정된 정보입니다";
            
            fos.write(msg.getBytes());
            // String msg를 알아서 byte 배열로 쪼개준다


        }catch(Exception e){

        }finally{
            try{
                if(fos!= null){
                    fos.close();
                }
            }catch(Exception e){

            }
        }




    }//main
}
