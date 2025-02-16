import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetHishestPaidEmployee {
    public static void main(String...sdf){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(100,45,2020,"Siva J","Computers","Male",30000));
        empList.add(new Employee(101,35,2022,"Radha J","Admin","FeMale",20000));
        empList.add(new Employee(102,12,2023,"Jithesh J","IAS","Male",50000));
        empList.add(new Employee(103,10,2023,"Yashika J","Scientiest","FeMale",20000));

        Optional<Employee> highestPaidSalEmp = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        Employee highPaidSal= highestPaidSalEmp.get();
        System.out.println("Employee:"+highPaidSal.name+"  Salary:"+highPaidSal.salary);


    }
}
