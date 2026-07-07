import java.util.*;
class Prog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum = 0;
            for(int j=0;j<n;j++){
                sum += (i ^ arr[j]);
            }

            if(sum > max){
                max = sum;
            }
        }

        System.out.print(max);
    }
}