import java.util.*;
class Strrev{
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number = ");
        String n =sc.next();
        int i = n.length()-1;
        while(i>=0)
        {
            System.out.print(n.charAt(i));
            i--;
        }
        
        
    }
}