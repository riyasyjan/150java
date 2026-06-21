import java.util.*;
class SumEvenOdd_Prog21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int even_sum =0;
        int odd_sum = 0;

        while(n>0){
            int dig = n%10;
            if(dig%2 == 0){
                even_sum += dig;
            }
            else{
                odd_sum += dig;
            }

            n = n/10;
        }
        System.out.println("The Sum of evn Digit in "+ temp +" is "+even_sum);
        System.out.println("The Sum of odd Digit in "+ temp +" is "+odd_sum);
    }
}