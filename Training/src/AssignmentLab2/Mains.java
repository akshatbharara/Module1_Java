package AssignmentLab2;
public class Mains {
public static void main(String str[])
{
System.out.println("CD:");
Cd c=new Cd(1150, "Java The Complete Reference", 47, 21, "Herbert Schildt", "Computer Science");
System.out.println(c.getTitle());
System.out.println(c.getArtist());
System.out.println(c.getGenre());

System.out.println("Video:");
Video v=new Video(1151, 35, "Head First Java", 10, "Bert Bates", "Computer Science", 2012);
System.out.println(v.getGenre());
System.out.println(v.getDirector());
System.out.println(v.getYear_rel());
}
}

