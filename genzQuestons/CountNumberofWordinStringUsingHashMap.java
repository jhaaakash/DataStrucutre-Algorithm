import java.util.*;

public class CountNumberofWordinStringUsingHashMap {
    public static void main(String[] args) {
        
        String sentance ="My name is Aakash Kumar is Jha";
        String[] words=sentance.split(" ");
        Map<String,Integer> wordCount=new HashMap<>();

        for(String str: words)
        {
            wordCount.put(str, wordCount.getOrDefault(str, 0)+ 1);
        }
        System.out.println(wordCount);
        //{Jha=1, Kumar=1, name=1, is=2, My=1, Aakash=1}

    }
    
}
