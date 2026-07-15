import java.util.*;
class prog100{
    public static void main(String[] args){
        String s = "aaabbbccc";
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        
        for(Character key : map.keySet()){
            System.out.print(key + "" + map.get(key));
        }
        
    }
} 