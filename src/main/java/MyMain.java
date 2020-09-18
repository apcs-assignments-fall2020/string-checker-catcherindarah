import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == a){
                counter++;
            }
            else if (str.charAt(i) == b){
                counter++;
            }
            else if (str.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.contains("the")){
            return true;
        }
        else if (str.contains("The")){
            return true;
        }
        else {
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int counter = 0;
        int len = str.length() -1;

        while (len > counter){
            if (str.charAt(counter) != str.charAt(len)){
                return false;
            }
            counter++;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
    }
}
