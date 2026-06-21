import java.util.*;
class DigCount_Prog15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        while(n > 0){
            n = n/10;
            count++;
        }

        System.out.println("All Digits count in "+ temp + " is "+ count);
    }
}