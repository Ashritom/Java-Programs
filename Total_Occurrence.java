import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Total_Occurrence{
public static void main(String[] args) throws FileNotFoundException {
File file = new File("abc.java");
Scanner scanner = new Scanner(file);
int count = 0;
while (scanner.hasNext()) {
if (scanner.nextInt() == 10) {
count++;
}
}
System.out.println("Total occurrences of 10: " + count);
}
}
