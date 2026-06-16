package arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> hashMap=new HashMap<>();

        System.out.println(hashMap.put(0,"a"));
        System.out.println(hashMap.put(0,"bb"));
        System.out.println(hashMap.put(10,"ccc"));
        System.out.println(hashMap.put(17,"yy"));
        System.out.println(hashMap.put(23,"a"));
        System.out.println(hashMap.put(0,"a"));

        Set<Map.Entry<Integer, String>> set =hashMap.entrySet();
        for(Map.Entry<Integer,String> entry:set){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<Integer> keySet=hashMap.keySet();
        for(Integer i:keySet){
            System.out.println(hashMap.get(i));
        }

    }
}
