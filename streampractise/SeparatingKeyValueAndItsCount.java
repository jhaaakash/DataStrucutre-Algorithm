package streampractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SeparatingKeyValueAndItsCount {

    public static void main(String[] args) {
    String[] lst={"Vegetables-Okra", "Vegetables-Spinach","Fruits-Apple", "Fruits-Banana", "Fruits-Grapes"};
    List<String> vegAndFruit= Arrays.asList(lst);
    Map<String, String> keyValue = 
    vegAndFruit.stream().collect(
        Collectors.groupingBy(
                               a -> a.split("-")[0],
                                                          Collectors.mapping(
                                                                             a -> a.split("-")[1],
                                                                             Collectors.joining(",")
                                                                            )
                             )
                              );
      keyValue.forEach((key, value) -> System.out.println(key + " -> " + value));
                            }
}
