package arraysandstring;

import java.util.Arrays;

/*
Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
 */
public class URLify {

    // using replace method
    public static String urlify(String str, int trueLength){
        str = str.trim();
        return str.replace(" ", "%20");
    }

    // manually
    public static String urlifyManually(String str, int trueLength){
        int index = trueLength - 1;
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        int n = chars.length-1;
        for(int i = index; i >=0; i--){
            if(chars[i] != ' '){
                chars[n] = chars[i];
            }else{
                chars[n] =  '0';
                chars[--n] = '2';
                chars[--n] = '%';
            }
            n--;
        }
        return new String(chars).trim(); // convert char array back to string and return it.
    }

    public static void main(String[] args) {
        System.out.println("--- Using replace() method ---");
        String str =  "Mr John Smith    "; // 13
        System.out.println(urlify(str, 13));

        System.out.println("--- Manually ---");
        System.out.println(urlifyManually(str, 13));


    }
}
