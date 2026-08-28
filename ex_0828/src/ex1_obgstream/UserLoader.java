package ex1_obgstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UserLoader {

    private User user;
    private FileInputStream fis = null;
    private ObjectInputStream ois = null;

    public User loadInfo(String tel) {
        String path = "C:/myFile/User/" + tel + "/save.sav";

        File f = new File(path);

        if (f.exists()) {

            try {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);

                // 읽어온 데이터를 user클래스 형태로 넘겨준다
                // ois.readObject()가 object라서
                // user 형태로 캐스팅
                user = (User) ois.readObject();
                // object 스트림을 거치면서 클래스 형태의 정보를
                // User 클래스로 바뀌면서 주소값을 준다
            } catch (Exception e) {

            }finally{
                try{
                    if( ois != null) ois.close();
                    if( fis != null) ois.close();
                }catch(Exception e){

                }
            }

        } else {
            System.out.println("해당 유저의 정보가 없습니다.");
        }

        return user;
    }
  
}
