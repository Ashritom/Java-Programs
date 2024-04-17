//Sum of two numbers using methode(without parameter and with return type)
import java.util.*;
class Test_r{
int Sum(){
System.out.println("Enter two values: ");
Scanner input= new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
return (a+b);
}
public static void main(String[] args){
Test_r ob = new Test_r();
System.out.println("The sum is  "+(ob.Sum()));
}
}


