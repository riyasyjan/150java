import java.util.*;
class Prog101{
    public static void main(String[] args){
        String s = "Riyaaabh";
        s= s.toLowerCase();
        String s1 ="";
        int lar = 0;
        
        for(int i=0;i<s.length();i++){
            int sec= 1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) ==  s.charAt(j)){
                    sec++;
                }
            }
            if(sec > lar){
                lar = sec;
                s1 = "";
                s1 += s.charAt(i);
            }
        }
        
        System.out.print(s1 + " " +lar);
    }
}