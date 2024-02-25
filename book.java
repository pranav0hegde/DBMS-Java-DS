import java.util.Scanner;
class book
{
String name;
String author;
int price;
int numpage;
public book(String name,String author,int price,int numpage)
{
this.name=name;
this.author=author;
this.price=price;
this.numpage=numpage;
}
public String toString()
{
String name,author,price,numpage;
name="Book name:"+this.name+"\n";
author="Author name:"+this.author+"\n";
price="Price:"+this.price+"\n";
numpage="Number of pages"+this.numpage+"\n";
return name+author+price+numpage;
}
}
public class main
{
public  static void main(String[]args)
{
Scanner s=new scanner(System.in);
int n;
String name;
String author;
int price;
int numpage;
System.out.println("Enter the number of books:");
n=s.nextInt();
book[]b=new book[n];
for(int i=0;i<n;i++)
{
system.out.println("Enter the name of the book:");
name=s.next();
System.out.println("Enter the author of the book:);
author=s.next();
System.out.println("Enter the price of the book:");
price=s.nextInt();
System.out.println("Enter the number of pages:");
numpage=s.nextInt();
b[i]=new book(name,author,price,numpage);
}
for(int i=0;i<n;i++)
{
System.out.println(b[i].toString());
}
}
}