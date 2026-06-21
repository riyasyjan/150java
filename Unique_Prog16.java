import java.util.*;
class Unique_Prog16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = n + "";
        String m = "";
        int count = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!m.contains(ch + "")){
                m = m + s.charAt(i);
                count++;
            }

        }

        System.out.println("The unique digits in " +n+ " is "+ count);
    }
}