package SEE;
import java.util.*;
import CIE.*;

public class external extends CIE.student{
public double S_Marks[];
int i;
public void Externalmarks(){
Scanner in=new Scanner(System.in);
S_Marks=new double[5];
System.out.println("Enter the SEE marks(out of 100)");
for(i=0;i<5;i++)
{
System.out.println("Enter see marks["+(i+1)+"]:-");
S_Marks[i]=in.nextDouble();
}
}
}