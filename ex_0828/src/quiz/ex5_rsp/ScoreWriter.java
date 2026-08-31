package quiz.ex5_rsp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ScoreWriter {
    

    public void sava(User user){

        FileOutputStream fos =null;
        ObjectOutputStream oos= null;

        String path ="C:/myFile/RspGame/"+user.getId()+"/info.sav";
        File dir = new File("C:/myFile/RspGame/"+user.getId());

        if(!dir.exists()){
            dir.mkdirs();
        }

        try{
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            // user객체를 objectStream에 통째로 저장
            oos.writeObject(user);

            System.out.println("기록저장");

        }catch(Exception e ){
            System.out.println("저장실패");
            e.printStackTrace();

        } finally{

            try{
                if(oos != null){
                    oos.close();
                }
                if(fos != null)
                    fos.close();

            }catch(Exception e){

            }
        }


      


    }//save
}
