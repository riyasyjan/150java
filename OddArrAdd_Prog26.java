import java.util.*;

class OddArrAdd_Prog26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int oddSum = 0;
        String oddArr = "";
        String evenArr = "";

        for (int i = 0; i < n.length(); i++) {
            int dig = n.charAt(i) - '0';

            if (dig % 2 != 0) {
                oddSum += dig;
                oddArr += dig;
            } else {
                evenArr += dig;
            }
        }

        System.out.println("The sum of odd digits is " + oddSum);
        System.out.println("The arrangement of odd and even is " + oddArr + evenArr);
    }
}