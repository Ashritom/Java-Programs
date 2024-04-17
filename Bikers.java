import java.util.*;
class Bikers
{
static float S1,S2,S3,S4,S5;
static float avg;
public static void main(String args[ ])
{
Scanner input = new Scanner(System.in);
System.out.println(" Enter Speed of five Bike Racer");
S1 = input.nextInt();
S2 = input.nextInt();
S3 = input.nextInt();
S4 = input.nextInt();
S5 = input.nextInt();
avg=(S1+S2+S3+S4+S5)/5;
System.out.println("Average speed of the Bikers is"+ avg);
if( S1>avg)
System.out.println("The Speed of Qualifying Racer is S1 who's speed is "+S1);
if( S2>avg)
System.out.println(" The Speed of Qualifying Racer is S2 who's speed is "+S2);
if( S3>avg)
System.out.println(" The Speed of Qualifying Racer is S3 who's speed is "+S3);
if( S4>avg)
System.out.println(" The Speed of Qualifying Racer is S4 who's speed is "+S4);
if( S5>avg)
System.out.println(" The Speed of Qualifying Racer is S5 who's speed is "+S5);
}
}
