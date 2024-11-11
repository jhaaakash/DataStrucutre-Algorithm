import java.util.List;
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

}
