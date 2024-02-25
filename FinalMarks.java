import CIE.student;
import CIE.internals;
import SEE.external;
import java.util.Scanner;
public class FinalMarks
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the number of students:");
int n=s.nextInt();
student[] stu=new student[n];
internals[] in=new internals[n];
external[] ex=new external[n];
for(int i=0;i<n;i++)
{
stu[i]=new student();
System.out.println("Enter the USN for student"+(i+1)+":");
stu[i].setUSN(s.next());
System.out.println("Enter name of the student"+(i+1)+":");
stu[i].setname(s.next());
System.out.println("Enter semester for student"+(i+1)+":");
stu[i].setsem(s.nextInt());
in[i]=new internals();
in[i].setinternalmarks(inputMarksWithValidation("internal",i,s,0,50));
ex[i]=new external(stu[i].getUSN(),stu[i].getname(),stu[i].getsem(),new int[5]);
ex[i].setSEEmarks(inputMarksWithValidation("external",i,s,0,100));
int[]finalmarks=new int[5];
for (int j=0;j<5;j++)
{
finalmarks[j]=in[i].getinternalmarks()[j]+ex[i].getSEEmarks()[j]/2;
}
System.out.println("Student"+(i+1)+"Final Marks:"+finalmarks[0]+","+finalmarks[0]+","+finalmarks[1]+","+finalmarks[2]+","+finalmarks[3]+","+finalmarks[4]);
}
s.close();
}
private static int[] inputMarksWithValidation(String type,int studentindex,Scanner s,int min,int max)
{
int[] marks=new int[5];
System.out.println("Enter"+type+"marks of student"+(studentindex +1)+".");
for(int i=0;i<5;i++)
{
int mark;
do
{System.out.println("Subject"+(i+1)+":");
mark=s.nextInt();
if(mark<0||mark>max)
{
System.out.println("Invalid input"+type+"marks should be between 0 and"+max+"Please try again");
}
}
while (mark<0||mark>max);
marks[i]=mark;
}
return marks;
}
}