import java.util.*;

class Primeinrange {
    
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Starting Value  = ");
       int n = sc.nextInt();
       System.out.print("Enter Ending Value  = ");
       int m = sc.nextInt();
       int i,j;
       System.out.print("Prime numbers in Given Range : ");
       for( i=n ; i<=m ; i++){
           for( j=2;j<=i;j++){
               if(i%j==0){
                    break;
               }
           }
           if(i==j){
               System.out.print(j + " ");
           }
           
       }
     
       }
   }  



