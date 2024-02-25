import java.util.Scanner;

abstract class Shape{
    double dim1,dim2;
    Shape(double a,double b){
        dim1=a;
        dim2=b;
    }
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(double a,double b){
        super(a,b);
    }
    void printArea(){
        System.out.println("Area of Rectangle is "+(dim1*dim2));
    }
}

class Triangle extends Shape{
    Triangle(double a, double b){
        super(a,b);
    }
    void printArea(){
        System.out.println("Area of Triangle is "+(dim1*dim2)/2);
    }
}

class Circle extends Shape{
    Circle(double a, double b){
        super(a,b);
    }
    final double pi=3.14159;
    void printArea(){
        System.out.println("Area of Circle is "+pi*Math.pow(dim1,2));
    }
}

class Main{
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        double a,b;
       
        System.out.println("Enter sides of rectangle: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        Rectangle r=new Rectangle(a,b);
       
        System.out.println("Enter height and base length of Triangle: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        Triangle t=new Triangle(a,b);
       
        System.out.println("Enter radius of Circle: ");
        a=sc.nextDouble();
        Circle c=new Circle(a,1);
       
        Shape s;
        s=r;
        s.printArea();
        s=t;
        s.printArea();
        s=c;
        s.printArea();
       
    }
}