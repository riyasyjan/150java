import java.util.*;

class Password_Prog36 {

    static boolean isStable(int num) {
        int[] freq = new int[10];

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                if (count == 0) {
                    count = freq[i];
                } else if (count != freq[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        int stableSum = 0;
        int unstableSum = 0;

        for (int num : nums) {
            if (isStable(num))
                stableSum += num;
            else
                unstableSum += num;
        }

        int password = stableSum - unstableSum;

        System.out.println("Password = " + password);
    }
}