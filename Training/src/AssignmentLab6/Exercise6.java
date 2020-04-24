package AssignmentLab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise6 {
public static void main(String args[]) {
try {
BufferedReader br=new BufferedReader(new FileReader("E:\\akshat.txt"));
int chars=0;
int words=0;
int lines=0;
String data;
while((data =br.readLine())!= null) {
        chars = chars + data.length();      
        lines++;
        String[] word = data.split(" ");
words=words+word.length;
     }

System.out.println("Number Of Chars In A File : "+chars);
           
            System.out.println("Number Of Words In A File : "+words);
             
            System.out.println("Number Of Lines In A File : "+lines);

} catch (IOException e) {
e.printStackTrace();
}
}
}

