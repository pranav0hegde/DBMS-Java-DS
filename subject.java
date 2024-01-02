import java.util.Scanner;
class subject
{
int subjectmarks;
int credits;
int grade;
}
public class student
{
subject[]subjecct;
String name;
String usn;
double SGPA;
Scanner s;
student()
{
int i;
subject=new subject[9];
for(i=0;i<9;i++)
subject[i]=new subject();
s=new scanner(System.in);
}
public void get studentdetails()
{
System.out.println("Enter the name");
name=s.nextline();
System.out.println("Enter USN");
name=s.nextline();
}
public void getmarks()
{
for(int i=0;i<8;i++)
{
System.out.println("Enter the marks for subject"+(i+1)+":");
suject[i].subjectmarks=s.nextInt();
System.out.println("Enter Credits for the subject"+(i+1)+":");
if (subject[i].subjectmarks >100)
{
System.out.println("Invalid marks entered");
i--;
}
else if(subject[i].subjectmarks>=90)
{
subject[i].grade=10;
}
else if(subject[i].subjectmarks>=80)
{
subject[i].grade=9;
}
else if(subject[i].subjectmarks>=70)
{
subject[i].grade=8;
}
else if(subject[i].subjectmarks>=60)
{
subject[i].grade=7;
}
else if(subject[i].subjectmarks>=50)
{
subject[i].grade=6;
}
else if(subject[i].subjectmarks>=40)
{
subject[i].grade=0;
}
}
}
public void compute SGPA()
{
double total credits=0;
double total grade points=0;
for(int i=0;i<8;i++)
{
total credits+=subject[i].credits;
total gradepoints+=subject[i].grade*subject[i].credits;
{
SGPA=total grade points/total credits;
}
public static void main(String args[])
{
student s1=new student();
s1.get studentdetials();
s1.get+marks();
s1.compute SGPA();
System.out.println("Name:"+s1.name);
System.out.println("USN:"+s1.USN);
System.out.println("SGPA:"+s1.SGPA);
}
}
}