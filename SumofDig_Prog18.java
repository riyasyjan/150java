import java.util.Scanner;
class SumofDig_Prog18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum =0;
        


        while(n>0){
            int dig = n%10;
            sum = sum + dig;
            n = n/10;

        }

        System.out.println("The sum of digits in "+temp+ " is "+sum);
    }
}