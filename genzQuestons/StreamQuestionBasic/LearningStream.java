package StreamQuestionBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LearningStream {
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(2,3,4,5,6,7,8,9,0); // First way f creating a list
        System.out.println("Even Number");
        list.stream().filter(e -> e%2 ==0).collect(Collectors.toList()).forEach(System.out::print);

        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9,0);  //Secind way of creating a list
        //Distinct Number
        List<Integer> distinctNumber =list1.stream().distinct().collect(Collectors.toList());
        for (Integer integer : distinctNumber) {
            System.out.println(integer);
        }

        //finding Max
        Optional<Integer> maxNumber= list.stream().max(Integer::compareTo);
        System.out.println("Maximum number is");
        System.out.println(maxNumber.get());










    }
}
