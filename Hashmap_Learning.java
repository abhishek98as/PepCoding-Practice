import java.util.HashMap;
import java.util.Set;

public class Hashmap_Learning {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("bihasara",123);
        hm.put("gaipura",234);
        hm.put("mirzapur",934);
        hm.put("jaunpur", 1998);
        hm.put("vindhychanl",1999);

        System.out.println(hm);



        System.out.println(hm.containsValue(934));
        // Set<String> keys=hm.keySet();
       // System.out.println(keys);

        for(String key: hm.keySet() ){
            Integer val=hm.get(key);
            System.out.println(key+"\n "+val);
        }
    }
}
