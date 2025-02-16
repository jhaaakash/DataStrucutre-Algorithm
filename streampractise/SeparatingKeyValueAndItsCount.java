package streampractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SeparatingKeyValueAndItsCount {
    
    String[] lst={"Vegetables-Okra", "Vegetables-Spinach","Fruits-Apple", "Fruits-Banana", "Fruits-Grapes"};
    List<String> vegAndFruit= Arrays.asList(lst);
    Map<String, String> keyValue= 
    vegAndFruit.stream().collect(Collectors.groupingBy(a ->a.split("-")[0],Collectors.mapping(a-> a.split("-")[1],Collectors.joining(","))));
    //forEach((k, v) -> System.out.println(k + " " + v));
    keyValue.stream().forEach((Key, Value) -> System.out.println(key +" "+Value));
    
}
