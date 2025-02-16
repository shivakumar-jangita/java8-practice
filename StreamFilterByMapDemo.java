package java$8$new;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFilterByMapDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Siva", 42, "Male", "Software Engineer", 2022, 30000));
		list.add(new Employee(102, "Radha", 22, "Female", "Software Engineer", 2020, 40000));
		list.add(new Employee(103, "Jithesh", 12, "Male", "Engineer", 2012, 20000));
		list.add(new Employee(104, "Yashika", 10, "Female", "School", 2016, 50000));
		
		//To write logic to get male & female count
		
		Map<String, Long> noOfMaleAndFemale = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		//System.out.println("noOfMaleAndFemale-  :"+noOfMaleAndFemale);
		
		

		//To print org name 
		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		//get Avg age of male & female empl's
		
		Map<String,Double> avgAgeofEmpls= list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		
		//System.out.println("avgAgeofEmpls-"+avgAgeofEmpls);
		
		//Get the details of highest paid employee in the organization?
		Optional<Employee> highestPaidEmployee = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
		Employee highestPaidEmpSalary = highestPaidEmployee.get();
		//System.out.println("highestPaidEmployeeName-"+highestPaidEmpSalary.name);
		//System.out.println("highestPaidEmpSalary-"+highestPaidEmpSalary.salary);
		
		//Get the names of all employees who have joined after 2015?
		
		list.stream().filter(e->e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);
				
		//Count the number of employees in each department?
		Map<String,Long> countEmpdeptWise = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("countEmpdeptWise"+countEmpdeptWise);
	}

}
