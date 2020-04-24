package AssignmentLab10.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class EmployeeService1 {
	    Employee1 e;
	    ArrayList<Employee1> emp;
		 
	  private <T> Stream<T> listToStream (List<T> list)
			{
				return list.stream();
			}

	  public EmployeeService1(ArrayList<Employee1> emp) {

				Stream<Employee1> stream = listToStream(emp);
				System.out.println(Arrays.toString(stream.toArray()));
			}
		   
	  //Sum of salaries of employees
		   public void sum_of_salary(ArrayList<Employee1> emp) {
			    List<Double> sal = new ArrayList<>();
			    
			   for(int i=0;i<emp.size();i++)
			   {
				  
				   sal.add((emp.get(i)).getSalary());
				   
			   }
			   System.out.println("Total sum of Salary:");
			 
			   Double sum=sal.stream().reduce((double) 0, Double::sum);
			   System.out.println(sum);
			   
		   }
		 //  employees without department
		   public void emp_without_department(ArrayList<Employee1> emp) {
			   List<Department1> dep = new ArrayList<>();
			   System.out.println("Employee without department:");
			   emp.stream().filter(e->e.getDepartment()==null).forEach(System.out::println);
		   }
	   }


