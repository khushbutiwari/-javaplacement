import java.util.Scanner;
class ifelse2
{
 public static void main(String[]args)
 { Double marks;
  System.out.println("enter any no");
  Scanner a= new Scanner(System.in);
  marks=a.nextDouble();
   if((marks>90)&&(marks<=100)) {
    System.out.println("grade A+ welldone");
   }else if(marks>80 && marks<90){
    System.out.println("grade A very good");
   }else if(marks>=60){
   System.out.println("grade b B good");
   }else if(marks>=50){
   System.out.println("grade c keepit up");}
   }
}
