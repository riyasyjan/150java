import java.util.Scanner;

class SteppingNumber_Prog32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n +"";
        boolean isStep = true;
        for(int i=0;i<s.length()-1;i++){
            int m1 = s.charAt(i) +'0';
            int m2 = s.charAt(i+1) +'0';

            if(Math.abs(m1-m2) != 1){
                isStep = false;

            }
        }

        if(isStep){
            System.out.println(n+" is a stepping number");
        }else{
            System.out.println(n + " is not a stepping number");
        }

    }
}
    

