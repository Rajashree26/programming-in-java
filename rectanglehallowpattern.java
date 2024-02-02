import java.util.Scanner;
public class rectanglehallowpattern
{
  public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
     system.out.print("what symbol u want to use");
     charsymbol=input.next().charAt(0);
     system.out.print("enter the number of rows");
     int rows=input.nextInt();
     system.out.print("enter the number of coloumn");
     int coloumn=input.nextInt();
   for(i=1;i<=rows;i++)
    {
   for(j=1;j<=coloumn;j++)
    {
      system.out.print(symbol+ " ");
    } 

      system.out.println();
     }
   }
}

