package Recursion.StringQuestions.Basics;

public class SkipString {
    public static void main(String[] args) {

        String str = "hehe, this is my string example... i love the strings. please don't laugh";
        String target = "string";

        System.out.println(skipString(str, target));
    }

    static String skipString(String str, String target) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith(target)) {
                return skipString(str.substring(target.length()), target);
        } else {
            return str.charAt(0) + skipString(str.substring(1), target);
        }
    }
}
