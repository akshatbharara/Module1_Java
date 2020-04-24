import java.io.*;  
public class FileDemo2 {  
public static void main(String[] args) {  
    File f=new File("/Users/Akshat/Documents");  
    String filenames[]=f.list();  
    for(String filename:filenames){  
        System.out.println(filename);  
    }  
}  
}  