package ex1_obgstream.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserWriter {
    
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    public void inputData(User user){

        String path ="C:/myFile/UserTest/"+user.getTel()+"/save.sav";

    }
}
