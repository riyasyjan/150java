import java.util.*;
class NthPrime_Prog13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num =2;
        while (true) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
             if (isPrime) {
                count++;

                if (count == n) {
                    System.out.println(num);
                    break;
                }
            }

            num++;
        }

    }
}