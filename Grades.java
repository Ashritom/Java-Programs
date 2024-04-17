import java.io.*;
import java.util.Scanner;
public class Grades{
public static void main(String[] args) throws IOException {
Scanner scanner = new Scanner(System.in);
double[] grades = new double[8];
for (int i = 0; i < 8; i++) {
System.out.print("Enter grade for student " + (i + 1) + ": ");
grades[i] = scanner.nextDouble();
}
DataOutputStream output = new DataOutputStream(new FileOutputStream("grades.txt"));
for (double grade : grades) {
output.writeDouble(grade);
}
output.close();
DataInputStream input = new DataInputStream(new FileInputStream("grades.txt"));
double highestGrade = Double.MIN_VALUE;
double lowestGrade = Double.MAX_VALUE;
while (input.available() > 0) {
double grade = input.readDouble();
if (grade > highestGrade) {
highestGrade = grade;
}
if (grade < lowestGrade) {
lowestGrade = grade;
}
}
input.close();
System.out.println("Highest grade: " + highestGrade);
System.out.println("Lowest grade: " + lowestGrade);
}
}
