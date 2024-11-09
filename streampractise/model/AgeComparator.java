import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    //Learning comparable as we can have multiple logic for comparision
    //comparinng the object here
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getAge()- o2.getAge());
    }
    
}
