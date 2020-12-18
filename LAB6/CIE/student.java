package CIE;
import java.util.*;
public class student{
public String usn;
public String name;
public int sem;

public void personal()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter usn:-");
usn=in.next();
System.out.println("Enter name:- ");
name=in.next();
System.out.println("Enter sem :-");
sem=in.nextInt();
}
public void display1(){
System.out.println("Name:-"+name+"\nUSN:-"+usn+"\nCurrent Semester:-"+sem);
}
}

