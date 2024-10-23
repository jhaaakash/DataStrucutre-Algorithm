import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingOperation {
    public void StreamGroupByCity(List<Employee> empList)
    {
        Map<String, List<Employee>> empByCity;
        empByCity= empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("Employees grouped by city :: \n" + empByCity);
        /*
         * {Chennai=[Employee [id=3, name=efg, age=30, salary=115, gender=M, deptName=HR, city=Chennai, yearOfJoining=2014], 
		  Employee [id=4, name=def, age=32, salary=125, gender=F, deptName=HR, city=Chennai, yearOfJoining=2013]],
Pune=[Employee [id=7, name=uvw, age=26, salary=130, gender=F, deptName=IT, city=Pune, yearOfJoining=2016]], 
Noida=[Employee [id=5, name=ijk, age=22, salary=150, gender=F, deptName=IT, city=Noida, yearOfJoining=2013]], 
Blore=[Employee [id=1, name=abc, age=28, salary=123, gender=F, deptName=HR, city=Blore, yearOfJoining=2020], 
	   Employee [id=9, name=stv, age=25, salary=160, gender=M, deptName=IT, city=Blore, yearOfJoining=2010]], 
Trivandrum=[Employee [id=8, name=pqr, age=23, salary=145, gender=M, deptName=IT, city=Trivandrum, yearOfJoining=2015]], 
Gurugram=[Employee [id=6, name=mno, age=27, salary=140, gender=M, deptName=IT, city=Gurugram, yearOfJoining=2017]], 
Hyderabad=[Employee [id=2, name=xyz, age=29, salary=120, gender=F, deptName=HR, city=Hyderabad, yearOfJoining=2015]]}
         */
    }
}
