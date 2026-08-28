package Ex7_filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex3_BufReader {
    
    public static void main(String[] args) {
        
        String path = "C:/myFile/work3.txt";
        File f =new File(path);

        FileReader fr = null;
        BufferedReader br = null;
        //bufferedReader부터는 줄단위로 읽는게 가능하다

      


        try{
            fr= new FileReader(f);
            br= new BufferedReader(fr);

            String msg;

            while((msg=br.readLine())!= null){
                System.out.println(msg);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null){
                    br.close();
                }

                if(fr!= null){
                    br.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
