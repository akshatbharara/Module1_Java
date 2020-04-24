package AssignmentLab10.StreamAPI;

public class Employee1 extends Department1 {
  int employeeId;
  String firstName;
  String lastName;
  String email; 
  String phoneNumber;
  String hireDate;
  String designation;
  double salary;
  int managerId;
  Department1 department;
 
	  public Employee1(int employeeId, String firstName, String lastName, String email, String phoneNumber, 
			  String hireDate , String designation,  double salary, int managerId,
				 Department1 department) {
		  super(managerId, designation, managerId);
			// TODO Auto-generated constructor stub
		  this.employeeId=employeeId;
		  this.firstName=firstName;
		  this.lastName=lastName;
		  this.email=email;
		  this.phoneNumber=phoneNumber;
		  this.hireDate=hireDate;
		  this.designation=designation;
		  this.salary=salary;
		  this.managerId=managerId;
		 this.department=department;
		}
	  public String toString() {
		  
		  
	        return "employeeid "+ this.employeeId +" | name "+ this.firstName +" | lastName "+this.lastName+"\n";
	    }
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Department1 getDepartment() {
		return department;
	}
	public void setDepartment(Department1 department) {
		this.department=department;
	}

	
  
}
