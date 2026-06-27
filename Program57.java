import java.util.Scanner;

class Program57 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lar = arr[0];
        int sec_lar = Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i] > lar ){
                sec_lar = lar;
                lar = arr[i];
            }
            else if(arr[i] > sec_lar && arr[i] != lar) {
                sec_lar = arr[i];
            }

        }
        System.out.println("The second largest number in the array is " + sec_lar);

    }
}