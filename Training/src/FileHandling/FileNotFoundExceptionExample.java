package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileNotFoundExceptionExample
{
    public void checkFileNotFound() throws FileNotFoundException
    {
        try 
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } 
        finally
        {
        	System.out.println("Unchecked Exception");
        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {
		FileNotFoundExceptionExample example = new FileNotFoundExceptionExample();
		example.checkFileNotFound();
	}
}