//Sum of two numbers using methode(with parameter and with return type)
import java.util.*;
class Test_p_r{
static int Sum(int x, int y){
int sum=x+y;
return sum;
}
public static void main(String[] args){
System.out.println("Enter two values: ");
Scanner input= new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
System.out.println("The sum of "+a+" and "+b+" is "+Sum(a,b));
}
}


