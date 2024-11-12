
import java.util.*;

public class Employee  implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
                + ", deptName=" + deptName + ", city=" + city + ", yearOfJoining=" + yearOfJoining + "]";
    }

    public Employee(int id, String name, int age, long salary, String gender, String deptName, String city,
            int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
    }

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
        
        for (Employee employee : empList) {
            System.out.println(employee);
        }      
        //Grouping Employee by their city attribute     
        StreamGroupingOperation object= new StreamGroupingOperation();
        object.StreamGroupByCity(empList);
         //Grouping Employee by their age attribute
        StreamGroupingByAge object1= new StreamGroupingByAge();
        object1.StreamGroupByAge(empList);

        //Getting Employee Count Gender Wise
        GenderWiseCountFromList object2= new GenderWiseCountFromList();
        object2.countNumberOfMaleAndFemale(empList);

        //Printing Nmae of all Department
        StreamPrintingAllDepartment object3 = new StreamPrintingAllDepartment();
        object3.streamPrintingAllDepartment(empList);

        System.out.println("/n");

        //Printing Employee detailsby age criteria
        System.out.println("Printing Employee detail based upon age Criteria");
        StreamOperationFunction objectforAllOperation= new StreamOperationFunction();
        objectforAllOperation.streamOperationAgeByCriteria(empList);

        //Finding Maximum age of the employee
        System.out.println("Printing maximum age of employee");
        objectforAllOperation.streamOperationMaxEmployeeAge(empList);

        //Printing Average Age of Male and Female Employees
        System.out.println("Printing Average Age of Male and Female Employees");
        objectforAllOperation.averageAgeforMaleAndFemale(empList);

        //Printing the Number of Employees in Each Department
        System.out.println("Printing the Number of Employees in Each Department");
        objectforAllOperation.countOfEmployeeDeptWise(empList);


        //******************************Comparable vs Comparator********************************************* */
        //Learning Comparable vs Comparator
        //Comparable same class, and compareto method, +,-,0
System.out.println();
System.err.println();
      System.out.println("Soritng of element with the help of comparable");
        Collections.sort(empList);
        for (Employee employee : empList) {
            System.out.println(employee);
        }
        System.out.println();
//Learning comparable as we can have multiple logic for comparision
        Collections.sort(empList, new AgeComparator());
        for (Employee employee : empList) {
            System.out.println(employee);
        }

    }
// here we have overwrite the comparable logic natually
    @Override
    public int compareTo(Employee o) {
       return(this.id - o.id);
    }

   
}
