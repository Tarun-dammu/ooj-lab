package CIE;
import java.util.*;
public class internals{
public double C_Marks[];
int i;
  
public void internalmarks(){
Scanner in=new Scanner(System.in);
C_Marks=new double[5];
System.out.println("Enter the CIE marks (out of 50):");
for(i=0;i<5;i++)
{
System.out.println("Enter CIE marks for subject."+(i+1)+":-");
C_Marks[i]=in.nextDouble();
}
}
}