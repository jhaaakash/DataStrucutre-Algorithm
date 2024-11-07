package StreamQuestionBasic;

import java.util.List;
import java.util.stream.Collectors;

public class LearningStream {
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(2,3,4,5,6,7,8,9,0);
        list.stream().filter(e -> e%2 ==0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
