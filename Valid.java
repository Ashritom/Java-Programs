import java.util.Scanner;
public class Valid{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the age: ");
int a = input.nextInt();
if(a>=18)
System.out.println("He is Eligible For Voting");
else
System.out.println("He is Not Eligible For Voting");
}
}
