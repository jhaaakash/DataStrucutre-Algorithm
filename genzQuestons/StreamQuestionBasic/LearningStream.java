package StreamQuestionBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearningStream {
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(2,3,4,5,6,7,8,9,0); // First way f creating a list
        System.out.println("Even Number");
        list.stream().filter(e -> e%2 ==0).collect(Collectors.toList()).forEach(System.out::print);

        List<Integer> list1= Arrays.asList(3,4,2,6,1,5,7,8,9,0);  //Secind way of creating a list
        //Distinct Number
        List<Integer> distinctNumber =list1.stream().distinct().collect(Collectors.toList());
        for (Integer integer : distinctNumber) {
            System.out.println(integer);
        }

        //finding Max
        Optional<Integer> maxNumber= list.stream().max(Integer::compareTo);
        System.out.println("Maximum number is");
        System.out.println(maxNumber.get());

        //sumof all element
      int totalSum=  list.stream().mapToInt(Integer::intValue).sum();
      System.out.println("Total of all the number is:");
      System.out.println(totalSum);

      //All name to upper case:
      System.out.println("Converting all the name to upper case");
      List<String> names= Arrays.asList("Aakash", "Komal","Abhishek","Pooja","Dilip");

       List<String> capitalName=names.stream().map(String::toUpperCase).collect(Collectors.toList());
       for (String string : capitalName) {
        System.out.print(" " +string);
       }
       System.out.println();
       
       //Sort list
       List<Integer> sortedIntegers= list1.stream().sorted().collect(Collectors.toList());
       System.out.println("Sorted list");
       for (Integer integer : sortedIntegers) {
        System.out.print(integer + " ");
       }

       //Count Elements
       System.out.println("Display the count of the element greater than 5");
       long countOfElement=list1.stream().filter(e -> e>5).count();
       System.out.println("the total number of element greater than 5 is " +countOfElement);

       //Getting Distinct Elements:
       List<Integer> list3= Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,6,6,6,5,5,8,8,8,9,9,0);
      List<Integer> distinctNumbers= list3.stream().distinct().collect(Collectors.toList());
      System.out.println("Distict element in the list3 is: ");
      for (Integer integer : distinctNumbers) {
        System.out.print(integer+ " ");
      }
        //*****************IMP*********************************** */
      //Reduce to Sum 
     Integer sum= list1.stream().reduce(0, Integer::sum);
     System.out.println("Reducing the element to sum");
     System.out.println("After reducing the list the sum we got is: " +sum);

     // Find Any
      System.out.println("learning Find Any operation in java");
     Integer findAnyResult= list1.stream().findAny().get();
     System.out.println("The output of find any operation is " +findAnyResult);

      //Listing First name from a list contian  fullname
      List<String> fullnames = Arrays.asList("Aakash Jha" ,"Abhishek Jha","Komal Jha");
      List<String> firstname=fullnames.stream().map(e -> e.split(" ")[0]).collect(Collectors.toList());
      System.out.println("Firstname from the full name ");
      for (String string : firstname) {
        System.out.print(string + " ");
      }
      System.out.println();

      //Learning use of ALL Match
      System.out.println("Leaninng AllMatch");
      boolean allNumberGreaterThan0 = list3.stream().allMatch(e -> e >= 0);
      System.out.println(allNumberGreaterThan0);

      //Learning AnyMatch in Stream
      System.out.println("learning any Stream");
      boolean anyNumberGreaterThan5=list3.stream().anyMatch(e ->e >5);
      System.out.println(anyNumberGreaterThan5);

      //Learning NoneMatch in Stream
      System.out.println("Learning NoneMatch in Stream");
      boolean noneMatchLearning=list3.stream().noneMatch(e -> e <0);
      System.out.println(noneMatchLearning);

      //Learning Find First:
      System.out.println("learning Find First");
     Optional<Integer> findFirstElement= list3.stream().findFirst();
     System.out.println(findFirstElement.get());

     //**********************IMPORTANT*******************************/
     //Learning FlatMap:
     System.out.println("Learning  Flat Map in stream");
     List<List<Integer>> nestedNumbers= Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(6,7,8,9,10));
    List<Integer> flaList= nestedNumbers.stream().flatMap(List::stream).collect(Collectors.toList());
    for (Integer integer : flaList) {
        System.out.print(integer+ " ");
    }

    System.out.println();

    //Grouping Elements:
    List<Student> studentList= new ArrayList<>();
    studentList.add(new Student(1, "Aakash", 29));
    studentList.add(new Student(2, "Abhishek", 27));
    studentList.add(new Student(3, "Rohit", 30));
    studentList.add(new Student(4, "Prakash", 29));
    System.out.println("Learning Group by Operation");
    Map<Integer, List<Student>> groupStudentByAge =studentList.stream().collect
    (Collectors.groupingBy(Student::getAge));
    System.out.println(groupStudentByAge);

    //Peek Elements:peek element of the stream during processing without altering them
    System.out.println("Using Stream Peek Operation");
    List<Integer> peekedAtNumbers=list3.stream().peek(System.out::println).collect(Collectors.toList());

    //Limit Stream
    System.out.println("Learning Stream Limit feature");
   List<Integer> LiitedNumber= list1.stream().filter(e -> e>4).limit(3).collect(Collectors.toList());
    for (Integer integer : LiitedNumber) {
      System.out.print(integer+" ");
    }
  }
}
