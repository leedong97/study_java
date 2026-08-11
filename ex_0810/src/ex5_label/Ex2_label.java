package ex5_label;

public class Ex2_label {

    public static void main(String[] args) {
        
       my: for(int i =1; i <=5; i++){
            
            switch(i){
                case 3:
                    System.out.println("case 1");
                    break my;
            }//switch
            for (int j=1; j<=10; j++){

                if(j %2 ==0){
                    //
                    break my;
                }
            }
            System.out.println("안녕");





        }//for
    }// main
}
