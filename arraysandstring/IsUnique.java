package arraysandstring;

import java.util.ArrayList;

/* s Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? */
public class IsUnique {

    //  Hashmap implementation
    public static boolean isUnique(String str) {
        ArrayList<Character> visited = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(visited.contains(str.charAt(i))) {
                return false;
            }else{
                visited.add(str.charAt(i));
            }
        }
        return true;
    }

    // without using any data structures
    public static boolean isUniqueWithoutDS(String str) {
        for(int i = 0; i < str.length() - 1; i++){
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Sort and check respective items

    // array implementation
    public static boolean isUniqueArray(String str){
        // 256 for extended ASCII characters
        boolean[] visited = new boolean[128];
        if(str.length() > 128){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(visited[val]){
                return false;
            }
            visited[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("...ArrayList Implementation...");

        String str = "aaabbccdaa";
        System.out.println(isUnique(str)? "All characters are unique" : "Not all characters are unique"); // Output: Not all characters are unique

        str = "abcd";
        System.out.println(isUnique(str)? "All characters are unique" : "Not all characters are unique"); // Output: Not all characters are unique

        System.out.println("....Without Any DS implementation...");
        str = "aaabbccdaa";
        System.out.println(isUniqueWithoutDS(str)? "All characters are unique" : "Not all characters are unique"); // Output: Not all characters are unique

        str = "abcd";
        System.out.println(isUniqueWithoutDS(str)? "All characters are unique" : "Not all characters are unique"); // Output: Not all characters are unique

        System.out.println("....Array Implementation...");
        str = "aaabbccdaa";
        System.out.println(isUniqueArray(str)? "All characters are unique" : "Not all characters are unique"); // Output: Not all characters are unique

        str = "abcd";
        System.out.println(isUniqueArray(str)? "All characters are unique" : "Not all characters are unique"); // Output: Not all characters are unique
    }
}
