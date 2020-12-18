
import CIE.*;
import SEE.*;
import java.util.*;
class finalmark
{
public static void main(String args[]){
int finalmarks;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of Students:-");
int n=in.nextInt();
       
student[] D= new student[n];
internals[] M1= new internals[n];
external[] M2=new external[n];
for(int j=0;j<n;j++)
{
D[j]=new student();
D[j].personal();
M1[j]=new internals();
M1[j].internalmarks();
M2[j]=new external();
M2[j].Externalmarks();
}

for(int j=0;j<n;j++)
{
D[j].display1();
System.out.println("Final marks of student "+(j+1)+":-");
for(int i=0;i<5;i++)
{
finalmarks=(int)(M1[j].C_Marks[i]+M2[j].S_Marks[i]/2);
System.out.println("SUBJECT-"+(i+1)+"is:-"+finalmarks);
}
} 
}
}