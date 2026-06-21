import java.util.*;
class IsPalindrome_Prog22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int rev = 0;

        while(n>0){
            int dig = n%10;
            rev = rev*10 + dig;
            n = n/10;
        }

        if( temp == rev){
            System.out.println("The given number "+temp+ " is a Palindrome");
        }
        else{

             System.out.println("The given number "+temp+ " is not a Palindrome");
        }
    }
}