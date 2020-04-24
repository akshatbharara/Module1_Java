package AssignmentLab2;

abstract class Item {

private int uid,no_of_copies;
private String title;
public Item(int uid, int no_of_copies, String title) {
super();
this.uid = uid;
this.no_of_copies = no_of_copies;
this.title = title;
}
public int getUid() {
return uid;
}
public void setUid(int uid) {
this.uid = uid;
}
public int getNo_of_copies() {
return no_of_copies;
}
public void setNo_of_copies(int no_of_copies) {
this.no_of_copies = no_of_copies;
}
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}
@Override
public String toString() {
return "Item [uid=" + uid + ", no_of_copies=" + no_of_copies + ", title=" + title + "]";
}

}

abstract class WrittenItem extends Item
{
private String auth_name,auth_place;
private int auth_exp;

public WrittenItem(int uid, int no_of_copies, String title) {
super(uid, no_of_copies, title);
// TODO Auto-generated constructor stub
}


public WrittenItem(int uid, int no_of_copies, String title, String auth_name, String auth_place, int auth_exp) {
super(uid, no_of_copies, title);
this.auth_name = auth_name;
this.auth_place = auth_place;
this.auth_exp = auth_exp;
}


public void setAuth_name(String auth_name) {
this.auth_name = auth_name;
}


public void setAuth_place(String auth_place) {
this.auth_place = auth_place;
}


public void setAuth_exp(int auth_exp) {
this.auth_exp = auth_exp;
}


public String getAuth_name() {
return auth_name;
}


public String getAuth_place() {
return auth_place;
}


public int getAuth_exp() {
return auth_exp;
}


}
class Book extends WrittenItem
{

public Book(int uid, int no_of_copies, String title) {
super(uid, no_of_copies, title);
// TODO Auto-generated constructor stub
}

}
class JournalPaper extends WrittenItem
{
public JournalPaper(int uid, int no_of_copies, String title) {
super(uid, no_of_copies, title);
// TODO Auto-generated constructor stub
}

private int year_pub;

public int getYear_pub() {
return year_pub;
}

public void setYear_pub(int year_pub) {
this.year_pub = year_pub;
}


}
abstract class MediaItem extends Item
{
private int runtime;

public MediaItem(int uid, int no_of_copies, String title, int runtime) {
super(uid, no_of_copies, title);
this.runtime = runtime;
}

public int getRuntime() {
return runtime;
}

public void setRuntime(int runtime) {
this.runtime = runtime;
}

}
class Video extends MediaItem
{
public Video(int uid, int no_of_copies, String title, int runtime) {
super(uid, no_of_copies, title, runtime);
// TODO Auto-generated constructor stub
}
private String director,genre;
private int year_rel;


public Video(int uid, int no_of_copies, String title, int runtime, String director, String genre, int year_rel) {
super(uid, no_of_copies, title, runtime);
this.director = director;
this.genre = genre;
this.year_rel = year_rel;
}
public String getDirector() {
return director;
}
public void setDirector(String director) {
this.director = director;
}
public String getGenre() {
return genre;
}
public void setGenre(String genre) {
this.genre = genre;
}
public int getYear_rel() {
return year_rel;
}
public void setYear_rel(int year_rel) {
this.year_rel = year_rel;
}


}
class Cd extends MediaItem
{
private String artist,genre;

public Cd(int Id, String name, int num_copies,int runtime, String artist, String genre) {
super(Id, runtime, name, num_copies);
this.artist = artist;
this.genre = genre;
}

public String getArtist() {
return artist;
}

public void setArtist(String artist) {
this.artist = artist;
}

public String getGenre() {
return genre;
}

public void setGenre(String genre) {
this.genre = genre;
}



}

public class Items {
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