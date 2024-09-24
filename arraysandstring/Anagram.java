package arraysandstring;

import java.util.Arrays;

/* Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other. */
public class Anagram {
    // using sort
    public static String sort(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean isAnagramSorting(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    // using count
    public static boolean isAnagramCount(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        int[] countArray = new int[str1.length()];
        for(int i = 0; i < str1.length(); i++){
            int val = str1.charAt(i);
            countArray[val]++;
        }

        for(int i = 0; i < str2.length(); i++){
            int val = str2.charAt(i);
            countArray[val]--;
            if(countArray[val] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";

        System.out.println("----Using Sorting ---");
        System.out.println(isAnagramSorting(a, b));

        System.out.println("----Using Count ---");
        System.out.println(isAnagramCount(a, b));
    }
}
