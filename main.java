import java.util.Scanner;
abstract class shape
{
int lenght;
int breadth;
int height;
int base;
int radius;
abstract void printArea();
}
class rectangle extends shape
{
void printArea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the dimensions of the rectangle:");
lenght=s.nextInt();
breadth=s.nextInt();
System.out.println("Area of the rectangle"+(lenght*breadth));
}
}
class triangle extends shape
{
void printArea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the dimensions of the triangle:");
height=s.nextInt();
base=s.nextInt();
System.out.println("Area of the triangle"+(base*height/2));
}
}
class circle extends shape
{
void printArea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the dimensions of the circle:");
radius=s.nextInt();
System.out.println("Area of the circle"+(radius*radius*3.14));
}
}
public class main
{
public static void main(String agrs[])
{
shape s1;
s1=new rectangle();
s1.printArea();
s1=new triangle();
s1.printArea();
s1=new circle();
s1.printArea();
}
}