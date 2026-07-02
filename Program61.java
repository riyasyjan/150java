class Program61 {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,25,35,45};
        int n = 2;


        reverse(arr, 0, n);


        reverse(arr, n+1, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}