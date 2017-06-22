import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<String, String>();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println("Map Elements");
        System.out.println("\t" + m1);
        System.out.println("Contain K Allen? " + m1.containsKey("Allen"));
        System.out.println("Contain K Zara? " + m1.containsKey("Zara"));
        System.out.println("Contain V 14? " + m1.containsValue("14"));
        System.out.println("Contain V 18? " + m1.containsValue("18"));
        System.out.println("Set: " + m1.entrySet());
        retrieveMap1(m1);
        retrieveMap2(m1);
    }

    public static void retrieveMap1(Map<String, String> m) {
        System.out.println("== Retrieve Map 1 ==");
        System.out.println("Keys:");
        for (String s : m.keySet()) {
            System.out.println(s);
        }
        System.out.println("Values:");
        for (String s : m.values()) {
            System.out.println(s);
        }
        System.out.println("====");
    }

    public static void retrieveMap2(Map<String, String> m) {
        System.out.println("== Retrieve Map 2 ==");
        for (Map.Entry<String, String> entry : m.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        System.out.println("====");
    }
}


// refs:
// https://www.tutorialspoint.com/java/java_map_interface.htm
// java - How to get values. keys from HashMap? - Stack Overflow https://stackoverflow.com/questions/16246821/how-to-get-values-keys-from-hashmap
