import java.util.*;
class PrimeRange_Prog14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int count = 0;


            for(int num =from; num <= to ;num++){
                if(num < 2){
                    continue;
                }
                boolean Prime = true;

                for(int i=2; i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        Prime =false;
                        break;
                    }
                }

                if(Prime){
                    count++;
                }


            }
        

        System.out.println("Prime range from "+from+" to "+to+ " is " + count);
    }
}