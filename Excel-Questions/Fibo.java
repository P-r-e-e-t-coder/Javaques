import java.util.*;

class Fibo {
    
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter value of n = ");
       String a = sc.next();
       int num1 =0;
       int num2 =1;
	   double n = Double.parseDouble(a);
	   if(n!=(int)n){System.out.print("Enter a positive interger value");}
	   else {
	   System.out.print("Fibonacci Series = ");
	   
           if(n==1){
               System.out.print(num1);
           }
           else if(n>1){
               System.out.print(num1 + "," + num2 + ",");
           }
		   else if (n<=0){
			   System.out.print("Enter a valid positive integer");
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
   }  



