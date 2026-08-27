package ex1_file;

import java.io.File;

public class Ex4_File {
    
    public static void main(String[] args) {
        
        String path = "c:/myFile/abc";
        File f = new File(path);//파일 클래스는 폴더까지는 만들수는 있다.하지만 파일 구조를 만들수가 없다.
                                // 그래서그것을 하기위해 IO/DO가 필요하다

        //f가 참조하고 있는 경로가 물리적으로 존재하지 않을때 라는 조건
        if( !f.exists()){
            System.out.println("폴더를 생성합니다");
            //f.mkdir() -> 이건 폴더를 하나밖에 못만든다
            f.mkdirs(); // -> 조건을 만족할때 폴더"들"을 만든다는 메서드
        }





        
    }
}
