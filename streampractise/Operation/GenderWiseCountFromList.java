import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderWiseCountFromList {
    
    public void countNumberOfMaleAndFemale(List<Employee>  empList)
    {
        Map<String, Long> noOfMaleAndFemaleEmployees;
        noOfMaleAndFemaleEmployees= empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Count of male and female employees present in the organization:: \n" + noOfMaleAndFemaleEmployees);
    }
    /*
     * Count of male and female employees present in the organization::
{F=5, M=4}
     */
}
