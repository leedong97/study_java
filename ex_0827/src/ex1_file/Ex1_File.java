package ex1_file;

import java.io.File;

public class Ex1_File {
    

    public static void main(String[] args) {
        
        // IO(Input/ Output)
        // IO는 입출력 스트림을 의미한다
        // 스트림이란 데이터를 입출력하기 위한 방법
        // JVM에서 콘솔(jvm외부의 모든것)로 값을 내보내면 Output,
        // 콘솔의 값을 JVM에서 읽을땐 Input

        // 입출력 스트림의 종류
        // 1) byte기반의 스트림 :
        //  - 문자관련된것 이외 모든것
        //  모양) ....Stream 구조의 클래스들

        // 2) char기반의 스트림
        // - 문자관련된건 이건 2byte기반의 스트림이라 한글,영어가 가고 오고가 잘돼서 이걸 쓴다.
        // - ...Reader, ...Writter 구조의 클래스들

        String path = "c:/java/test.txt";
        File f = new File(path); // 저 경로까지의 파일을 읽어올 권한을 가진다.
        
        // System.out.println(f.length()); //용량을 byte단위로 표현을 해주는것이 length이다.
        //                                 // 파일안에 정보가있는데도 0이 나오면 파일까지 제대로 못간것이다.

        //생성한 file객체가 파일구조라면 if문이 돌아간다
        if(f.isFile()){
            System.out.println("용량: "+ f.length()+"byte");
        }


    }//main
}
