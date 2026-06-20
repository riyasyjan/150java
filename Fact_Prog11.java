import java.util.*;
class Fact_Prog11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }

        System.out.println("The factorial of " + n+ " is "+ fact);
    }
}