import java.util.Scanner;
public class Bsort{
public static void main(String[] args){
int n=10,i,j,x;
int arr[] = new int[n];
Scanner s = new Scanner(System.in);
System.out.println("Enter 10 elements in random Order ");
for(i=0;i<n;i++){
arr[i] = s.nextInt();
}
for(i=0;i<(n-1);i++){
for(j=0;j<(n-i-1);j++){
if(arr[j] > arr[j+1]){
x= arr[j];
arr[j] = arr [j+1];
arr[j+1] = x;
}
} 
}
System.out.println("The new Sorted Array is: ");
for(i=0;i<n;i++)
System.out.print(arr[i]+ " " );
}
}
