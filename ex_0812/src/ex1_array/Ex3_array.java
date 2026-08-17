package ex1_array;

public class Ex3_array {
    public static void main(String[] args) {
        
        // char[] ch= new char[4];
        // ch[0]='J';
        // ch[1]='A';
        // ch[2]='V';
        // ch[3]='a';
        char[] ch ={'j','a','v','a'};
        for(int i=0; i<ch.length;i++){
            System.out.println(ch[i]);
        }


        System.out.println("-------------------------------");

        char[]ch2 = {'j','a','v','A'};
        // char[] ch2;
        // 여기까지가 배열의 선언후에는 
        // ch2 ={'j','a','v','a'};가 안된다
        for(int i =0; i< ch2.length;i++){
            System.out.println(ch2[i]);
        }


    }//main
}
