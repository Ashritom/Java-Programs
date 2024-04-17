import java.util.Random;
public class Random_Number_neg_poseve_posodd {
public static void main(String[] args) {
int[] numbers = new int[10];
Random random = new Random();
for (int i = 0; i < numbers.length; i++) {
numbers[i] = random.nextInt(100) - 50; 
System.out.println("Generated number: " + numbers[i]);
}
Thread negativeThread = new Thread(() -> {
for (int number : numbers) {
if (number < 0) {
System.out.println(number + " is negative");
}
}
});
Thread positiveEvenThread = new Thread(() -> {
for (int number : numbers) {
if (number > 0 && number % 2 == 0) {
System.out.println(number + " is positive even");
}
}
});
Thread positiveOddThread = new Thread(() -> {
for (int number : numbers) {
if (number > 0 && number % 2 != 0) {
System.out.println(number + " is positive odd");
}
}
});
negativeThread.start();
positiveEvenThread.start();
positiveOddThread.start();
}
}
