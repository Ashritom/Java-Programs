import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
System.out.println("Enter the number: ");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int temp,rem,sum=0;
temp=num;
while(temp!=0){
rem=temp%10;
sum=(sum*10)+(rem);
temp=temp/10;
}
if(sum==num)
System.out.println("It is a palindrome number");
else
System.out.println("It is not a Palindrome");
}
}

