package ex02_work;

public class EncodeSub {
    
    

        char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
        '&', '*', '(', ')', '-', '_', '+', '=', '|',
        '[', ']', '{', '}', ';', ':', ',', '.', '/' };

        char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y',
        'u', 'i', 'o', 'p' };

        // String result="";
        StringBuffer result = new StringBuffer();
        // StringBuffer는 문자열을 직접수정할수있게해주는 클래스이다

        public String encoding(String str){

            for(int i=0; i <str.length(); i++){

                char ch = str.charAt(i);


                if(ch >= 'a'&& ch <='z'){
                    result.append( abcCode[ch-'a']);
                    
                }else if(ch >='0' && ch <= '9'){
                    result.append(numCode[ch-'0']);
                }

            }//for
            return result.toString();
            //.toString은
            //StringBuffer을 문자열 구조로 반환합니다라는 뜻이다










        }//encoding()

        
    
}
