package CIE;
public class student
{
public String USN;
public String name;
public int sem;
public student()
{
this("","",0);
}
public student(String USN,String name,int sem)
{
this.USN=USN;
this.name=name;
this.sem=sem;
}
public void setUSN(String USN)
{
this.USN=USN;
}
public void setName(String name)
{
this.name=name;
}