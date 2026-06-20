import java.util.*;
class LastDigit_Prog3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = n%10;
        System.out.println("The last Digit of " + n + " is "+ m);
    }
}