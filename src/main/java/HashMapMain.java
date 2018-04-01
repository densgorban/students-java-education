import java.util.*;

public class HashMapMain {

    static Map<String, Auto> hashMap = new HashMap<String, Auto>();

    Map<String, Auto> hashMap2 = new HashMap();

    public static void main(String[] args) {
        
        hashMap.put("key1", new Auto( "MAZ", 16f));

        Auto auto = hashMap.get("key1");

        System.out.println("Assert equals "+ auto.equals(new Auto("MAZ", 20f)));

        Set<String> keys = hashMap.keySet();
        List<Auto> values = (List<Auto>) hashMap.values();

        for(String key: keys){
            Auto auto1 = hashMap.get(key);
            System.out.println(auto1);
        }

        keys.forEach(k -> hashMap.get(k));
    }
}
