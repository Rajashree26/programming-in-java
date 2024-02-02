import java.util.Scanner;
public class factors
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int factors=0;
for(int i=1;i<=n;i++)
{
if(i%n==0)
{
factors++;
}
}
System.out.println("number of factors"+factors);
}
}
