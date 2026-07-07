
import java.util.LinkedHashMap;

class Program62 {
    public static void main(String[] args) {
        int[] arr = {40,20,10,50,20,10,30,40};

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Integer key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
