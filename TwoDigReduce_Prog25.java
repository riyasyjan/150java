import java.util.*;
class TwoDigReduce_Prog25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n + "";
        
        
        while(s.length() > 2){
            String red ="";
            for(int i=0;i<s.length()-1 ;i++){
                red = red + (Math.abs((s.charAt(i) - '0') - (s.charAt(i+1) - '0')) +"");
        }
        s = red;
    }

    System.out.println("The reduced to two is "+ s);
    
}
}
