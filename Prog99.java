import java.util.*;
class Prog99{
    public static void main(String[] args){
        String s = "5ingt44t3";
        String s1 = "";
        int sum =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                s1 += ch;
            }
            else{
                if(!s1.equals("")){
                    sum += Integer.parseInt(s1);
                    s1 = "";
                }
            }
        }
        
        if(!s1.equals("")){
            sum += Integer.parseInt(s1);
        }
        System.out.println(sum);
    }
}