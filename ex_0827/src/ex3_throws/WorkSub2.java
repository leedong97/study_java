package ex3_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkSub2 {
    



    File f= new File( MyPath.PATH+"work.txt"); 
    byte[] console = new byte[(int)f.length()];
    FileInputStream fis = null;

    public void result() throws FileNotFoundException,IOException{
            // throws는 여기서 발생하는 예외처리를
            // main으로 짬때린다는뜻, 2개의 예외를 넘겨버렷다
        
        fis = new FileInputStream(f);
        fis.read(console);

        System.out.println(new String(console));

        fis.close();

    }//result()
}
