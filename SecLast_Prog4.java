import java.util.*;
class SecLast_Prog4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        temp = n/10;
        int m = temp%10;
        System.out.println("The Second last digit of " + n + " is "+ m);
    }
}