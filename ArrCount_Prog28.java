import java.util.Scanner;

public class ArrCount_Prog28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int oddSum = 0;
        int evenSum = 0;
        String oddArr = "";
        String evenArr = "";

        for (int i = 0; i < n.length(); i++) {
            int dig = n.charAt(i) - '0';

            if (dig % 2 != 0) {
                oddSum++;
                oddArr += dig;
            } else {
                evenSum++;
                evenArr += dig;
            }
        }

        
        System.out.println("The arrangement of odd and even is " + oddArr + oddSum + evenArr +evenSum);
    }
    
}
