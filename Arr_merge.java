import java.util.*;
public class Arr_merge{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
int arr1[] = new int[15];
int arr2[] = new int[15];
int mergedArr[] = new int[30];
System.out.println("Enter 15 numbers for the first array: ");
for(int i=0;i<15;i++){
arr1[i]=scanner.nextInt();
}
System.out.println("Enter 15 numbers for the second array: ");
for(int i=0;i<15;i++){
arr2[i]=scanner.nextInt();
}

System.arraycopy(arr1,0,mergedArr,0,arr1.length);
System.arraycopy(arr1,0,mergedArr,arr1.length,arr2.length);

Arrays.sort(mergedArr);

Map<Integer,Integer>countMap = new HashMap <>();

for(int i=0;i<mergedArr.length;i++){
int current = mergedArr[i];
countMap.put(current,countMap.getOrDefault(current,0)+1);
}

System.out.println("Distinct Elemets\t Count");
for(Map.Entry<Integer,Integer>entry: countMap.entrySet()){
System.out.println(entry.getKey()+"\t\t\t"+ entry.getValue());
}
}
}