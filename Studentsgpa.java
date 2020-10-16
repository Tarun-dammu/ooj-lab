import java.util.Scanner;
class Student {
	 String usn;
	String name;
    int credits[];
	int marks[];
	 int n;

	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.println("USN:");
		usn=s.next();
		System.out.println("Name:");
		name=s.next();
		System.out.println("Enter the number of subjects:");
		n=s.nextInt();
		credits=new int[n];
		marks=new int[n];
		System.out.println("Enter credits and marks attained by the student in each subject");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter credits and marks attained in subject"+(i+1));
                        credits[i]=s.nextInt();
			marks[i]=s.nextInt();
		}
	}
	void display()
	{
		System.out.println("Student details:");
		System.out.println("USN:"+usn);
		System.out.println("Name:"+name);
		System.out.println("Marks in each subject:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Subject "+(i+1)+":"+marks[i]);
		}
	}
	double calculate()
	{
		int tcp=0,tc=0;
		for(int i=0;i<n;i++)
		{
			tc=tc+credits[i];
			if(marks[i]>=50)
			{
			tcp=tcp+(((marks[i]/10)+1)*credits[i]);
			}
			else if(marks[i]>=40 && marks[i]<50)
			{
				tcp=tcp+(4*credits[i]);
			}
		}
		return (double)tcp/tc;
	}
}
	class Studentsgpa
	{
		
	public static void main(String args[]) {
		Student s1=new Student();
		s1.accept();
		s1.display();
		System.out.println("SGPA: "+s1.calculate());
	}
	}