import java.util.*;

class anagram{
    public static boolean check_anagram(String str1, String str2){
        // Finding the lengths of two strings
        int str1_length = str1.length();
        int str2_length = str2.length();

        // Checking the base condition that if two strings have different lengths then it can't form anagaram
        if(str1_length != str2_length){
            return false;
        }

        // Storing str1 characters in char_array1 and str2 characters in char_array2
        char[] char_array1 = str1.toCharArray();
        char[] char_array2 = str2.toCharArray();

        // sort the char array of str1 and str2
        Arrays.sort(char_array1);
        Arrays.sort(char_array2);

        // Returning the result
        return Arrays.equals(char_array1, char_array2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Enter the strings below

        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();

        //Result

        System.out.println(check_anagram(str1, str2));

    }
}