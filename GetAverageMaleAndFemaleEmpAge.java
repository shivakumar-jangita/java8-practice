import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetAverageMaleAndFemaleEmpAge {

    public static void main(String...asd){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(100,45,2020,"Siva J","Computers","Male",30000));
        empList.add(new Employee(101,35,2022,"Radha J","Admin","FeMale",20000));
        empList.add(new Employee(102,12,2023,"Jithesh J","IAS","Male",50000));
        empList.add(new Employee(103,10,2023,"Yashika J","Scientiest","FeMale",20000));

        Map<String,Double> average = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
average.entrySet().forEach(e->{
    System.out.println("Gender: "+e.getKey()+"  Avg:"+e.getValue());
        }

);


    }

}
