package ex3_stringbuffer;

public class Ex1_StringBuffer {
    
    public static void main(String[] args) {
        
        String str = "안녕";
        str = "반갑습니다";
        str +="!";
        System.out.println(str);

        StringBuffer sb = new StringBuffer("안녕");
        sb.setLength(0);
        sb.append("반가워요");
        //append는 만들어 놓은 메모리 안에서 문자열을 이어 붙힌다는 뜻이다.
        sb.append("!!!");
        System.out.println(sb.toString());


    }//main
}
