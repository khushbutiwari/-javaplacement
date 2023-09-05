import java.util.Scanner;
class numb
 {
  public static void main(String[] args)
   {int a;int b; int largest;
    Scanner n=new Scanner(System.in);
    
    System.out.println("enter a");
    a= n.nextInt();
    System.out.println("enter b");
    b= n.nextInt();
    
    if(a>b)
      largest= a;
    else
      largest=b;
    System.out.println("/nlargest="+largest);
    }
  }

