//Sum of two numbers using methode(with parameter and without return type)
import java.util.*;
class Test_p{
void Sum(int x, int y){
int sum=x+y;
System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
}
public static void main(String[] args){
System.out.println("Enter two values: ");
Scanner input= new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
Test_p ob = new Test_p();
ob.Sum(a,b);
}
}


