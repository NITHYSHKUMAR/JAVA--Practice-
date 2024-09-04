package javapractice;
import java.util.*;

public class Arraytwo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        findElements(arr, n, k);
    }

    public static void findElements(int[] arr, int n, int k) {
        if (k < 1) {
            System.out.println("Invalid input: k must be at least 1.");
            return;
        }
    
        int threshold = n / k;
        
     
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
      
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
      
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}