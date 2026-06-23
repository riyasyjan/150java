import java.util.Scanner;

 class OddFollEven_Prog27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

      
        String oddArr = "";
        String evenArr = "";

        for (int i = 0; i < n.length(); i++) {
            int dig = n.charAt(i) - '0';

            if (dig % 2 != 0) {
                
                oddArr += dig;
            } else {
                evenArr += dig;
            }
        }

        
        System.out.println("The arrangement of odd and even is " + oddArr + evenArr);
    }
    
}
