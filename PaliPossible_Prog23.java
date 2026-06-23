import java.util.Scanner;

class PaliPossible_Prog23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int[] freq = new int[10];

        for (int i = 0; i < num.length(); i++) {
            freq[num.charAt(i) - '0']++;
        }

        int oddCount = 0;

        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1)
            System.out.println("Palindrome Possible");
        else
            System.out.println("Palindrome Not Possible");
    }
}