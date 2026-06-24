import java.util.*;

class AddSubN_Prog35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int n = sc.nextInt();   

        int result = sum;

        boolean add = (n == 2);

        for (int i = sum - 1; i >= 1; i--) {

            if (add)
                result += i;
            else
                result -= i;

            add = !add;
        }

        System.out.println(result);
    }
}