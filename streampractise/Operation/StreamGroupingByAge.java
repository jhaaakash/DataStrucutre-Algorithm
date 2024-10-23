import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByAge {
    
    public void StreamGroupByAge(List<Employee> empList)
    {
        Map<Integer, List<Employee>> empAge;
        empAge= empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("Employees grouped by Age :: \n" + empAge);
    }

    /*
     * Employees grouped by Age ::
{32=[Employee [id=4, name=def, age=32, salary=125, gender=F, deptName=HR, city=Chennai, yearOfJoining=2013]], 22=[Employee [id=5, name=ijk, age=22, salary=150, gender=F, deptName=IT, city=Noida, yearOfJoining=2013]], 23=[Employee [id=8, name=pqr, age=23, salary=145, gender=M, deptName=IT, city=Trivandrum, yearOfJoining=2015]], 25=[Employee [id=9, name=stv, age=25, salary=160, gender=M, deptName=IT, city=Blore, yearOfJoining=2010]], 26=[Employee [id=7, name=uvw, age=26, salary=130, gender=F, deptName=IT, city=Pune, yearOfJoining=2016]], 27=[Employee [id=6, name=mno, age=27, salary=140, gender=M, deptName=IT, city=Gurugram, yearOfJoining=2017]], 28=[Employee [id=1, name=abc, age=28, salary=123, gender=F, deptName=HR, city=Blore, yearOfJoining=2020]], 29=[Employee [id=2, name=xyz, age=29, salary=120, gender=F, deptName=HR, city=Hyderabad, yearOfJoining=2015]], 30=[Employee [id=3, name=efg, age=30, salary=115, gender=M, deptName=HR, city=Chennai, yearOfJoining=2014]]}
     */
}
