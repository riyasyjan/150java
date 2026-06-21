import java.util.*;
class EvenDigsum_Prog19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int even_count = 0;

        while(n>0){
            int dig = n%10;
            if(dig%2 == 0){
                even_count++;
            }

            n = n/10;
        }
        System.out.println("The even Digit count in "+ temp +" is "+even_count);
    }
}