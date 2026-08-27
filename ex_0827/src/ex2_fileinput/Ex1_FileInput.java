package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex1_FileInput {

    public static void main(String[] args) {

        String path = "C:/myFile/test.txt";
        File f = new File(path);
        FileInputStream fis = null;
        if (f.exists()) {

            try {
                // 파일과 연결된 입력스트림 - 파일의 input을 가능하게 하기 위해 stream을 생성한다는 뜻이다.
                // 파일 inputStream은 1byte기반의 스트림이고 영문은 1byte/한글은 2byte라 일단 문제가 생기고
                // 한글 2byte짜리를 읽기위해 반으로 쪼개서 읽으면서 문제가 생기는것이다.
                fis = new FileInputStream(f);// <- 위에서 조건문으로 파일이 있을때만 하겟다고 햇지만 thread.sleep처럼
                                             // filenotfount오류가 자주나는거라 java에서 try-catch를 강제했다.

                int code = 0;

                while ((code = fis.read()) != -1) { // code = fis.read() -> code에 FileInputStream의 File 정보를 읽어오겟다는 뜻
                                                    // read는 순차적으로 읽다가, 더이상 뒤에 문자가 없어서 못읽을때
                                                    // 파일의 끝(EOP)인 -1의 값이 된다.
                    System.out.print((char) code);// 처음엔 파일을 못읽는다, 메모장파일을 utf-8에서 ansi로 일단 변경
                } // while
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // **매우 중요한 약속 **
                // 사용을 마친 스트림은 반드시 닫아줘야한다.
                try {
                    fis.close();
                } catch (Exception e) {

                }

            }

        } // main
    }
}
