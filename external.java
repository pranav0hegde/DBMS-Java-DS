package SEE;
import CIE.student;
public class external extends student
{
public int[] SEEmarks=new int[5];
public external()
{
this("","",0,new int[5]);
}
public external(String USN,String name,int sem,int[] SEEmarks)
{
super(USN,name,sem);
this.SEEmarks=SEEmarks;
}
public int[] getSEEmarks()
{
return SEEmarks;
}
}
