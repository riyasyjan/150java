import java.util.Scanner;

class GenFindNth_Prog34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos = sc.nextInt();

        int[] arr = new int[pos];

        System.out.print("Enter input 1 : ");
        arr[0] = sc.nextInt();

        System.out.print("Enter input 2 : ");
        arr[1] = sc.nextInt();

        System.out.print("Enter input 3 : ");
        arr[2] = sc.nextInt();

        int x = arr[1] - arr[0];
        int y = arr[2] - arr[1];

        for (int i = 3; i < pos; i++) {
            if (i % 2 == 1)
                arr[i] = arr[i - 1] + x;
            else
                arr[i] = arr[i - 1] + y;
        }

        System.out.print("The Generated series is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nThe digit in the position is : " + arr[pos - 1]);
    }
}