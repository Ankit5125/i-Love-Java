package Recursion.StringQuestions.SubSequence;

public class SubSequence {
    public static void main(String[] args) {
        
        String str = "abcd";

        subString("", str);
    }

    static void subString(String tmp, String str){
        if (str.length() == 0) {
            System.out.println(tmp);
            return;
        }        
        char ch = str.charAt(0);
        subString(tmp, str.substring(1));
        subString(tmp+ch, str.substring(1));
    }
}
