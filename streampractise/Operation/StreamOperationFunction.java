import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamOperationFunction {
    
    public void streamOperationAgeByCriteria(List<Employee> empList)
    {
       List<Employee> empWithAgeMoreThan28= empList.stream().filter(e -> e.getAge() >28).collect(Collectors.toList());
       for (Employee employee : empWithAgeMoreThan28) {
        System.out.println(employee);
       }
    }

    public void streamOperationMaxEmployeeAge(List<Employee> empList)
    {
       int maxAgeofEmployee= empList.stream().mapToInt(Employee::getAge).max().getAsInt();
       
       System.out.println("Max age of employee is : " +maxAgeofEmployee);
    }

    public void averageAgeforMaleAndFemale(List<Employee> empList)
    {
      Map<String,Double> averageAge;
      averageAge= empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
      System.out.println(averageAge);

    }

   public void countOfEmployeeDeptWise(List<Employee> empList) {
     
      Map<String,Long> emplDeptCountWise;
      emplDeptCountWise=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
      System.out.println(emplDeptCountWise);
   }

}
