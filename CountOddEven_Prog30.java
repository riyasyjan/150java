import java.util.*;
class CountOddEven_Prog30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd_count = 0;
        int  even_count =0;
         while(n>0){
            int dig = n%10;
            if(dig%2 == 0){
                even_count++;
            }else{
                odd_count++;
            }
            n = n/10;
         }
         System.out.println("Odd count : "+odd_count+  " Even count : " + even_count);
    }
}