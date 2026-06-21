import java.util.*;
class OddDigsum_Prog20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int odd_count = 0;

        while(n>0){
            int dig = n%10;
            if(dig%2 != 0){
                odd_count++;
            }

            n = n/10;
        }
        System.out.println("The odd Digit count in "+ temp +" is "+odd_count);
    }
}