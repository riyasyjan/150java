import java.util.*;
class Magic_Prog24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        while(n>9){
            sum =0;
            while(n>0){
                int dig = n%10;
                sum = sum + dig;
                n = n/10;
            }
            n = sum;
            
        }
        if(sum == 1){
            System.out.println("It is a magic number");

        }else{
            System.out.println("It is a not magic number");
        }

    }
}


