import java.util.*;

public class Main {
    static final int ITEMS = 13;
    static final int CAPACITY = (int) (Math.ceil(ITEMS*1.3));
    static HashMap<String,Integer> h = new HashMap<String,Integer>(CAPACITY);
    
    public static void main(String[] args) {    
        initHashMap();
        printHashMap();
    }

    public static void initHashMap() {
        String keyInt;
        for (int i = 0; i < 1000; i++) {
            keyInt = "" + ((int) (Math.random() * ITEMS));
            if (h.get(keyInt) == null) {
                h.put((keyInt + ""), 1);
            } else {
                h.put((keyInt + ""), (Integer) (h.get(keyInt)) + 1);
            }
        }
    }
    
    public static void printHashMap() {
        Set keySet = h.keySet();   // returns all keys in the HashMap
        Iterator iter = keySet.iterator();
        
        while (iter.hasNext()) {
            Object key = iter.next();
            Object value = h.get(key);
            System.out.println(key + ": " +
                    ", hashcode = " + key.hashCode() + 
                    ", occurrences = " + value);
        }
        
        System.out.println(h.keySet());
        System.out.println(h.values());
    }
    
    public static String getItem(String s) {
        return "" + ((Integer) (h.get(s)));
    }
}
