package ex1_obgstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutionException;

public class UserWriter {

    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    public void wirteInfo(User user) {

        String path = "C:/myFile/User/" + user.getTel() + "/save.sav";
        File dir1 = new File("C:/myFile/User/");

        if (!dir1.exists()) {
            dir1.mkdirs();
        }
        File dir2 = new File(dir1, user.getTel());
        // dir1 경로를 부모 폴더로 두고,
        // 그 안에 user.getTel() 값을 이름으로 가지는 하위 경로를 File 객체로 생성
        //  File(부모경로, 자식경로)
        
        if (!dir2.exists()) {
            dir2.mkdirs();
        }
        try {

            fos = new FileOutputStream(path);
            // 너가 보내고싶은곳 (path)라고 정의하고 outStream만들어
            oos = new ObjectOutputStream(fos);

            // user객체를 통째로 저장
            // 지금 이시점에서 save.sav 가 만들어진다.
            oos.writeObject(user);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("유저정보 저장 실패");
        } finally {

            try {
                if (oos != null)
                    oos.close();
                if (fos != null)
                    fos.close();
            } catch (Exception e) {

            }
        }
    }
}
