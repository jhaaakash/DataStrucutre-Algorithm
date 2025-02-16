import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacterInString {
    public static void main(String[] args) {
        String str = "aaabbbccddde";
       // char[] charArray = str.toCharArray();

        // Convert the charArray to a stream of Character
      str.chars().mapToObj(c -> (char) c) // Convert primitive char to Character
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
              .forEach((k, v) -> System.out.println(k + " " + v));
    }
}
