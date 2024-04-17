import java.util.*;
class Fahrenheit{
public static void main(String[] args){
System.out.println("Enter the temperature in Celcius: ");
Scanner input = new Scanner(System.in);
float c = input.nextFloat();
double f = ((9.0 / 5.0) * c) + 32;

//float f = ((9.0/5.0)*c)+32);

System.out.println("The temperature "+c+ " is : " +f);
}
}