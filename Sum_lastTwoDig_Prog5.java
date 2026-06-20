import java.util.*;
class Sum_lastTwoDig_Prog5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
    int temp = n;
    sum = sum + temp%10;
    temp = temp / 10;
    sum = sum + temp %10;

    System.out.println("The sum of Last two digits of " + n + " is "+ sum );
    }
}