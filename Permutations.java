package javapractice;

import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        char[] chars = str.toCharArray();
        Arrays.sort(chars); 
        permute(chars, 0, chars.length);
    }

    private static void permute(char[] chars, int l, int r) {
        if (l == r) {
            System.out.println(String.valueOf(chars));
        } else {
            for (int i = l; i < r; i++) {
                swap(chars, l, i);
                permute(chars, l + 1, r);
                swap(chars, l, i); 
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
