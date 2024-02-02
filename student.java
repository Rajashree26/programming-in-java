import java.util.Scanner;
public class student
{
public static void main(String[] args)
{
int a1=90;
int a2=92;
int a3=91;
int a4=95;
int total=(a1+a2+a3+a4);
float agg=total/4f;
System.out.println("agg");
System.out.println("total");
    if(agg>=75)
   {
     System.out.println("DISTINCTION");
   }

  else if(agg>=60 && agg<75)
  {
    System.out.println("FIRST DIVISION");
  }
  else if(agg>=50&&agg<60)
  {
    System.out.println("SECOND DIVISION");
  }
else if(agg>=40&&agg<50)
{
  System.out.println("THIRD DIVISION");
}
else
{
 System.out.println("FAIL");
}
}
}
