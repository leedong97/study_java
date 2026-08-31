package quiz.ex5_rsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class ScoreLoad {
    
    public User load(User user){

        String path ="C:/myFile/RspGame/"+user.getId()+"/info.sav";
        File dir= new File(path);
        FileInputStream fis= null;
        ObjectInputStream ois= null;
        // 밖에있는걸 갖고 와야하니까 input 스트림이다.

        

        if(dir.exists()){
            
            try{

                fis = new FileInputStream(dir);
                ois = new ObjectInputStream(fis);

                user = (User)ois.readObject();
                //받아온게 user인지 몰라서 캐스팅해줘야한다.
                //objectINPUT스트림을 만들면서 새로 NEW로 주소값을 받아서
                //main의 user와 주소값이 달라져서 지금 연결이 안되어있다,.
                

                System.out.println("로드성공");

            }catch(Exception e){
                System.out.println("로드실패");
                e.printStackTrace();

            }finally{
                try{
                    if(ois!= null)
                        ois.close();
                    if(fis!= null)
                        fis.close();
                }catch(Exception e){

                }
            }
        }

            return user;
    }//Load()




}
