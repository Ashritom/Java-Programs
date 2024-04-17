import java.util.*;
class Interest{
public static void main(String[] args){
float rate,amount,time;
System.out.println("Enter the Principle,Time,Rate of interest : ");
Scanner input = new Scanner(System.in);
amount = input.nextFloat();
time = input.nextFloat();
rate = input.nextFloat();
float interest = (float) (amount*rate*time)/100;
System.out.println("The Amount of Interest is :  "+interest);
}
}