import java .util.Scanner;
class evenodd
{
  public static void main(String args[])  
 { Scanner reader=new Scanner(System.in);

   System.out.println("enter new number");
   int num= reader.nextInt();
   if(int num % 2==0)
     System.out.println(num + "even number");
   else
    System.out.println(num + "odd number");
   }
}