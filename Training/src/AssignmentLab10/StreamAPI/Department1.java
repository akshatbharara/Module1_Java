package AssignmentLab10.StreamAPI;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Department1 
{
	
	int departmentId;
	String departmentName;
	int managerId;
	public Department1(int departmentId, String departmentName, int managerId)
	{
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		this.managerId=managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
}

