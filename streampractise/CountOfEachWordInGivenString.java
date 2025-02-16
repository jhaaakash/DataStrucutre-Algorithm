package streampractise;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachWordInGivenString {
    public static void main(String[] args) {
        String name="My Nmae is Aakash Kumar Jha. I am a Java Developer. I am Aakash Kumar";
        String[] words=name.split(" ");
        Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((Key,Value)-> System.out.println(Key +"->" +Value));
    }
}
