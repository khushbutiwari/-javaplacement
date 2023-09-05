import java.util.Scanner;
class calculator
{ 
  public static void main(String[]args)
 {  
    int a=14; int b= 24 ;  int ch;
    System.out.println("enter your choice");
    Scanner obj = obj.new Scanner(System.in);
    ch=obj.nextInt();
    switch(ch)
     {
      case 1:System.out.print("sum is"+ (a+b));
        break;
      case 2:System.out.print("multiply is" +(a*b));
        break;
      case 3:System.out.print("divide is"+( a/b));
        break;
      case 4:System.out.print("subtract is"+(a-b));
        break;
      default:System.out.print("invalid");
     }
   }
}
   
  