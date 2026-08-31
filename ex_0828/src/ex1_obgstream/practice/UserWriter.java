package ex1_obgstream.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserWriter {
    
    FileOutputStream fosTel = null;
    ObjectOutputStream oosTel = null;

    FileOutputStream fosNick = null;
    ObjectOutputStream oosNick = null;

    public void inputData(User user){
       
        String pathTel ="C:/myFile/UserTest/"+user.getTel()+"/save.sav";
        String pathNick = "C:/myFile/UserTest/"+user.getNickname()+"/save.sav";

        File dir1 = new File("C:/myFile/UserTest/");
        File dir2 = new File("C:/myFile/UserTest/");

        if(!dir1.exists()){
            dir1.mkdirs();
        }
        if(!dir2.exists()){
            dir2.mkdirs();
        }

        File dir1Tel = new File(dir1,user.getTel());
        File dir2Nick = new File(dir2, user.getNickname());

        if(!dir1Tel.exists()){
            dir1Tel.mkdirs();
        }
        if(!dir2Nick.exists()){
            dir2Nick.mkdirs();
        }
        
        try{
            fosTel= new FileOutputStream(pathTel);
            oosTel= new ObjectOutputStream(fosTel);
            oosTel.writeObject(user);
            // writeObject로 user의 정보를 받아서 보내는 메서드이다.

            fosNick = new FileOutputStream(pathNick);
            oosNick = new ObjectOutputStream(fosNick);
            oosNick.writeObject(user);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("유저정보 저장 실패");
        }finally{

            try{
                if(oosNick != null) oosNick.close();
                if(fosNick != null) fosNick.close();
                if(oosTel != null) oosTel.close();
                if(fosTel != null) fosTel.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
