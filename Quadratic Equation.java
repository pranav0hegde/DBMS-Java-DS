import java.util.Scanner;
class Quadratic
{
int a,b,c;
double r1,r2,d;
void getd()
{
Scanner s=new Scanner(System.in);
System.out.println("Pranav Hegde");
System.out.println("Enter the coefficients of a,b,c");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
}
void compute()
{
while(a==0)
{
System.out.println("not a quadratic equation");
System.out.println("Enter non zero values of a");
Scanner s=new Scanner(System.in);
a=s.nextInt();
d=b*b-4*a*c;
if(d==0)
{
r1=(-b)/(2*a);
System.out.println("Roots are real and Equal");
System.out.println("root1=root2="+r1);
}
else if (d>0)
{
r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
System.out.println("Roots are real and distinct");
System.out.println("root1="+r1+"root2="+r2);
}
else if(d<0)
{
System.out.println("roots are imaginary");
r1=(-b)/(2*a);
r2=Math.sqrt(-b)/(2*a);
System.out.println("root1="+r1+"+i"+r2);
System.out.println("root2="+r1+"-i"+r2);
}
}
}
class Quadraticmain
{
public static void main (String args[])
{
Quadratic q=new Quadratic();
q.getd();
q.compute();
}
}}