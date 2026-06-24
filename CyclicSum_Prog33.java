import java.util.*;

class CyclicSum_Prog33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int sum = 0;

            for (int j = i; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }

            total += sum;
        }

        System.out.println(total);
    }
}