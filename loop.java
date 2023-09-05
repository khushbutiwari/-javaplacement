import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        //for(int a=0; a<10;a++){
           // System.out.println("hello world");
           //System.out.println(a);
          // int i=0;
           //while(i<10){
            //System.out.println("cute");
            //i++;
            int i=0;
            do{
                System.out.println(i);
                i++;}
             while(i<10);
              
           }
        }
    // sum of first n num
    class num{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int sum=0;
            for (int i=0;i<=n;i++){
                 sum=sum+1;
            }
                System.out.println(sum);
            
        }
    }
    


//loop is used to excute a block of code  continusoly repatedtly until it achieve the final result for(intialization,condition,updation)