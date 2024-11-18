import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

   //************************************************To Learn*************************************
   public void fetchingOldestEmployee(List<Employee> empList) {
    Employee maxAge = empList.stream().max(Comparator.comparing(Employee::getAge)).get();
    System.out.println(maxAge+" the older ployee");
   }

   public void fetchYoungestFemaleEmployee(List<Employee> empList) {
      Employee youngestFemaleEmployee= empList.stream().filter(e -> e.getGender().equals("F")).min((o1, o2) ->(o1.getAge()-o2.getAge())).get();
      System.out.println(youngestFemaleEmployee);
   }

   public void findingEmployeeByAgeRange(List<Employee> empList) {
      System.out.println("Employees whose age is greater than 30 and less than 30");
      Map<Boolean, List<Employee>> partitionEmployeesByAge = empList.stream().collect(Collectors.partitioningBy(e -> e.getAge()>30));
      Set<Map.Entry<Boolean, List<Employee>>> empSet = partitionEmployeesByAge.entrySet();

for (Map.Entry<Boolean, List<Employee>> entry : empSet) {
 if (Boolean.TRUE.equals(entry.getKey())) {
 // Employees greater than 30 years old
 System.out.println("Employees greater than 30 years ::" + entry.getValue());
 } else {
 // Employees less than 30 years old
 System.out.println("Employees less than 30 years ::" + entry.getValue());
      }
   }
}



}
