import java.util.*;

public class Merging{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[15];
        int[] arr2 = new int[15];
        int[] mergedArr = new int[30];

        System.out.println("Enter 15 numbers for the first array:");
        for (int i = 0; i < 15; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter 15 numbers for the second array:");
        for (int i = 0; i < 15; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Merge the two arrays
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);

        // Sort the merged array
        Arrays.sort(mergedArr);

        // Create a map to store the count of each element
        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate through the merged array to count the occurrences of each element
        for (int i = 0; i < mergedArr.length; i++) {
            int current = mergedArr[i];
            countMap.put(current, countMap.getOrDefault(current, 0) + 1);
        }

        // Print the distinct elements and their counts
        System.out.println("Distinct Elements\tCount");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t\t" + entry.getValue());
        }
    }
}

