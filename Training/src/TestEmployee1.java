

public class TestEmployee1
{
    public static void main(String args[])
    {
        Employee e = new Employee("Patel" , "Suresh", 20000 , 1001);
        e.printAllInfo();
        e.addBonus(5);
        e.printAllInfo();
        
        
        
        Employee e1 = new Employee("Patel" , "Suresh1", 20000 , 1001);
        e1.printAllInfo();
        e1.addBonus(5);
        e1.printAllInfo();
        
        boolean b = e.equals(e1);
        System.out.println(" Equals check :" + b);
        
        
    }
}
