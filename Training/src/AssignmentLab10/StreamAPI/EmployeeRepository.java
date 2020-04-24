package AssignmentLab10.StreamAPI;

import java.util.ArrayList;

public class EmployeeRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> al=new ArrayList<Employee1>();
		//ArrayList<Department> al2=new ArrayList<Department>();
		Department1 db=new Department1(11,"IT",12);
		Department1 db1=new Department1(12,"Sales",15);
		al.add(new Employee1(101,"Akshat","Bharara","bhararaakshat@gmail.com","123456789","10/09/1998","Analyst",50000,110,db));
		al.add(new Employee1(102,"Shikhar","Bhatia","shikhar34@gmail.com","1235612198","05/12/2005","Assistant Manager",40000,104,db1));
		al.add(new Employee1(103,"Shrey","Sharma","shrey23@gmail.com","1532616623","10/21/2011","Sr.Analyst",80000,105,null));
		al.add(new Employee1(104,"Sunil","Verma","sunil34@gmail.com","9865452557","08/11/1999","Manager",40000,106,db1));
		EmployeeService1 ob=new EmployeeService1(al);
		ob.sum_of_salary(al);
		ob.emp_without_department(al);
		
	}

}
