import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {;
        System.out.println(capVowelsLowRest("One two tHRee world"));
        System.out.println(capVowelsLowRest(  "vowels are fun"));
        System.out.println(capVowelsLowRest("intro"));
        System.out.println(capVowelsLowRest("yellow"));
        System.out.println(capVowelsLowRest("Hello WOrld"));



        
    }

    public static String capVowelsLowRest (String string) {
        String ans ="";
        for (int i = 0; i < string.length(); i++) {
             char currentChar = string.charAt(i);
             boolean flip =true;
             if  (currentChar==' ' || "AEIOU".indexOf(currentChar)!=-1 ) { // אם האות הראשונה גדולה וגרונית אז זה נשאר
                ans+=currentChar;
            }
             else if (currentChar==' ' && currentChar+1< 'a' ||  currentChar+1< 'a'){
                ans+=(char) (currentChar + 32);
                flip =false;
            } else if ("aeiou".indexOf(currentChar) != -1) {
                ans += (char) (currentChar - 32);
                flip =false;
            }else if (currentChar==' ') {
                ans+=currentChar;
                flip =false;
            } else if (flip ){
            ans+=currentChar;
        }
    }
    return ans;
}

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
