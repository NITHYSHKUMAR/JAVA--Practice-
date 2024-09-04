package javapractice;
import java.util.*;
public class Duplicate {
    
    public static int findDuplicate(int[] nums) {
    
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

      
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int array[]=new int[5];
        System.out.println("Enter the array values");
        for(int i=0;i<5;i++){
            array[i]=s.nextInt();
        }
     
        int duplicate = findDuplicate(array);
        System.out.println("Duplicate number int the array : " + duplicate);
    }
}


