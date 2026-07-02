import java.util.*;

class Program60 {
    public static void main(String[] args) {

        int[] arr = {50,20,150,20,50,10,30,10,10};

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {

            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println("The occurrence of " + arr[i] + " is " + count);
        }
    }
}