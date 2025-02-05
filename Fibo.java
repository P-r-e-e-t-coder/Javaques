import java.util.*;

class Fibo {
    
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter value of n = ");
       int n = sc.nextInt();
       int num1 =0;
       int num2 =1;
	   System.out.print("Fibonacci Series = ");
           if(n==1){
               System.out.print(num1);
           }
           else{
               System.out.print(num1 + "," + num2 + ",");
           }
           for(int i=1;i<=n-2;i++){
            if(n>=3){
               int num3 = num1 + num2;
               System.out.print(num3 + ",");
               num1 = num2;
               num2 = num3;
            }           
           }
       }
   }  



