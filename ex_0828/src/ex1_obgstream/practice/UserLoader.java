package ex1_obgstream.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UserLoader {

    private User user;
    private FileInputStream fis = null;
    private ObjectInputStream ois = null;

    public User loadInfoTel(String tel) {
        String path = "C:/myFile/User/" + tel + "/save.sav";

        File f = new File(path);
        if(f.exists()){

            try {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ois != null)
                        ois.close();
                    if (fis != null)
                        fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else{
            System.out.println("해당 유저의 정보가 없습니다.");
        }

        return user;
    }

    public User loadInfoNick(String nickname) {
        String path = "C:/myFile/User/" + nickname + "/save.sav";
        File f = new File(path);
        if(f.exists()){

            try {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ois != null)
                        ois.close();
                    if (fis != null)
                        fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
    
            }
        }else{
            System.out.println("해당 유저의 정보가 없습니다.");
        }
        return user;
    }
}