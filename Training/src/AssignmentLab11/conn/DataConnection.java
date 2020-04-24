package AssignmentLab11.conn;
import AssignmentLab11.com.cg.eis.pl.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import AssignmentLab11.com.cg.eis.bean.Employee;

public class DataConnection extends Employee{
Connection con;
PreparedStatement stmt;

private int id;
private String name;
private int salary;
private String designation;
private String insuranceScheme;
public DataConnection(int id,String name,String designation,int salary,String insuranceScheme) {
this.id=id;
this.name=name;
this.designation=designation;
this.salary=salary;
this.insuranceScheme=insuranceScheme;
}
public void connect() throws ClassNotFoundException, SQLException {
Class.forName("oracle.jdbc.driver.OracleDriver");  
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","akshat","oracle");
}
public void  insertData() {
try {
connect();
stmt=con.prepareStatement("insert into emp1 values(?,?,?,?,?)");  
stmt.setInt(1,id);
stmt.setString(2,name);
stmt.setString(3,designation);
stmt.setInt(4,salary);
stmt.setString(5,insuranceScheme);
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
con.close();  
}catch(Exception e){
System.out.println(e);
}
}
}


