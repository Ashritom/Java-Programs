//Sum of two numbers using methode(without parameter and without return type)
import java.util.*;
class Test_w_p_r{
void Sum(){
System.out.println("Enter two values: ");
Scanner input= new Scanner(System.in);
int x = input.nextInt();
int y = input.nextInt();
int sum=x+y;
System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
}
public static void main(String[] args){
Test_w_p_r ob = new Test_w_p_r();
ob.Sum();
}
}


