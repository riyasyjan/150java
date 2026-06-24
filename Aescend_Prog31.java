import java.util.*;
class Aescend_Prog31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        String s = n +"";
        boolean aes = true;
        for(int i=0;i<s.length()-1;i++){
            
            int m1 = s.charAt(i) + '0';
            int m2 = s.charAt(i+1) + '0';
            if(m1>m2){
                aes = false;
                break;
            }

        }

        if(aes){
            System.out.println(n + " is in aescending order.");
        }
        else{
            System.out.println(n + " is not in aescending order.");
        }
    }
    
}
