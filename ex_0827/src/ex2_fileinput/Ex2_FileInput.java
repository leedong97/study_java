package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInput {
    
    public static void main(String[] args) {
        
        String path = "C:/myFile/test.txt";
        File f= new File(path);// 굳이 파일을 만드는 이유는 exist를 쓰고싶어서이다.
        byte[] text = new byte[(int)f.length()]; // f.length는 long형식으로 반환해주기 때문에 int형으로 형변환을 한번 해줘야한다.
        FileInputStream fis = null;

        if(f.exists()){

            try{
                fis = new FileInputStream(f);// input Stream을 f까지 만들어준다는 뜻이다.
                fis.read(text);// text의 파일을 읽고 배열에 넣는거까지이다.
                String res = new String(text); //byte 배열의 file을 조립해서 문자열로 만들어준다.
                System.out.println(res);
                

            }catch(Exception e){

            }finally{
                try{
                    if(fis != null){
                        fis.close();
                    }
                }catch(Exception e){

                }
            }

            }


    }//main
}
