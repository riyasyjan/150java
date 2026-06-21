import java.util.*;
class NonRepInt_Prog17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = n + "";
        String uni = "";
        int count =0;

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            if(!uni.contains(ch+"")){
                count++;
                uni = uni + ch;
            }

            else{
                count--;
            }
        }
        System.out.println("Non - Repeated Digits in "+n+ " is "+ count);

    }
}