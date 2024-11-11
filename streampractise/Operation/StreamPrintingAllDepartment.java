import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPrintingAllDepartment {

    public void streamPrintingAllDepartment(List<Employee> empList)
    {
      // List<Employee> distinctDepartment=
      System.out.println("Different Department are");
      List<String>  distinctDepartment= empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());
      for (String string : distinctDepartment) {
        System.out.print(string+" ");
      }
    }
}
