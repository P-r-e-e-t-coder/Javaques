import java.util.*;
class Numrev {
  public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.print("Number: ");
      int num = sc.nextInt();
      int rev = 0;
      while(num != 0) {
      int digit = num % 10;
      rev = rev * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed Number: " + rev);
  }
}