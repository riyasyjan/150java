class Program50 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {

            
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            
            char ch = (char)('A' + i - 1);


            for (int j = i; j >= 1; j--) {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }
    }
}