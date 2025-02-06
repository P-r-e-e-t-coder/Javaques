import java.util.*;
class Patterns{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of Rows = ");
int a = sc.nextInt();
System.out.print("Enter Symbol/String/Number You Want To Make Pattern of = ");
String s = sc.next();
System.out.println("Pyramid Pattern:");
for(int i=1;i<=a;i++){
	for(int j=1;j<=a-i;j++){
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++){
		System.out.print(s);
	}
	System.out.println();
}
System.out.println();
System.out.println("Half Triangle:");
for(int i=1;i<=a;i++){
	for(int j=1;j<=i;j++){
		System.out.print(s);
	}
	System.out.println();
}
System.out.println();
System.out.println("Reverse Half Triangle:");
for(int i=a;i>0;i--){
	for(int j=1;j<=i;j++){
		System.out.print(s);
	}
	System.out.println();
}
System.out.println();
System.out.println("Daimond:");
for(int i=1;i<=a;i++){
	for(int j=1;j<=a-i;j++){
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++){
		System.out.print(s);
	}
	System.out.println();
}
for(int i=a;i>0;i--){
	for(int j=1;j<=a-i;j++){
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++){
		System.out.print(s);
	}
	System.out.println();
}
}
}