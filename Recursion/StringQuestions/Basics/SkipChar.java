package Recursion.StringQuestions.Basics;

public class SkipChar {
    public static void main(String[] args) {
        
        String str = "bacaccad";
        char c = 'a';

        System.out.println(skipChar(str, c));
    }

    static String skipChar(String str, char c){
        if (str.isEmpty()) {
            return "";
        }

        char current = str.charAt(0);
        if (current == c) {
            return skipChar(str.substring(1), c);
        }
        else{
            return current+ skipChar(str.substring(1), c);
        }
    }
}
