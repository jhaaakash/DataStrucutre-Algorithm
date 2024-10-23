import java.util.*;
import java.util.Map.Entry;

 public class IterateHashMap {
    public static void main(String[] args) {
        
        Map<String, String> maps= new HashMap<>();
        maps.put("A", "Aakash");
        maps.put("B", "Bhusam");
        maps.put("C", "Chetan");
        maps.put("D", "Dipendar");
        maps.put("E", "Eklavya");
        for(Entry<String, String> forMap : maps.entrySet())
        {
            System.out.println(forMap.getKey()+ " ->" +forMap.getValue());
        }
       
        Iterator<Entry<String, String>> iterator = maps.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+ " ->" +entry.getValue());  
        }
    }
}
