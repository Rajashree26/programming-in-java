import java.util.Scanner;
public class test3{
public static void main(String[] args)
{
  Scanner inp = new Scanner(System.in);
  int lower= inp.nextInt();
  int upper=inp.nextInt();
  int i=0,x=1;
  while(i<upper)
    {
      int sum=0;
      int y=x*x;
      int t=y;
       while(y!=0)
       {
         int rem=y%10;
         sum=sum+rem;
         y=y/10;
       }
      if(sum<10)
      {
        System.out.print( t +" ");
       }
      i=x*x;
      x++;
     }
   }
	
  }