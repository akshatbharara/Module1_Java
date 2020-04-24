package SetsAndLists;

 import java.io.*;
 
 
public class InputStreamReaderExample {  
    public static void main(String[] args) {  
        try  {  
            InputStream stream = new FileInputStream("c:\\file.txt");  
            Reader reader = new InputStreamReader(stream);  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
        } catch (FileNotFoundException e) {
		 
			e.printStackTrace();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}  
        finally
        {
        	
        }
    }  
} 