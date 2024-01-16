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
    public static void main(String[] args) {
        System.out.println(camelCase(" tWo    wordS"));
        System.out.println(camelCase("HELLO world"));
        System.out.println(camelCase(  " Intro to coMPUter sCIEncE "));
        System.out.println(camelCase("world"));
        System.out.println(camelCase(" tWo    wordS"));



        
    }

    public static String capVowelsLowRest (String string) {
        String ans ="";
        for (int i = 0; i < string.length(); i++) {
             char currentChar = string.charAt(i);
             boolean flip =true;
             if  (currentChar==' ' || "AEIOU".indexOf(currentChar)!=-1 ) { // אם האות הראשונה גדולה וגרונית אז זה נשאר
                ans+=currentChar;
            }
             else if (currentChar==' ' && currentChar+1< 'a' ||  currentChar+1< 'a'){  // מקטין אותיות 
                ans+=(char) (currentChar + 32);
                flip =false;
            } else if ("aeiou".indexOf(currentChar) != -1) {  // הופך אותיות גרוניות לגדלות 
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
            String ans = "";
            boolean flip = true;
            int i = 0;
            int conter = 0;
        
            while (i < string.length()) {
                int firstSpace = string.indexOf(' ', i);
                String helper;
                if (firstSpace == -1) {
                    helper = string.substring(i);
                } else {
                    helper = string.substring(i, firstSpace);
                }
                conter++;
                for (int j = 0; j < helper.length(); j++) {
                    flip =ifTheFirstCap(helper);
                    boolean yep =true;
                    char currentChar = helper.charAt(j);
                    if ((yep && currentChar <'a')){  // דואג למילה הראשונה
                        ans+=(char) (currentChar+32);
                        yep=false;
                } else if (!flip && i>1) {
                    helper=Makescapitalletters(helper);
                    ans+=helper;
                    break;

                } else if (yep){
                        ans+=currentChar;
                        yep =false;
                    }    
                    }
            
                i += helper.length() + 1;
            }
        
            return ans;
        }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }


    public static String Makescapitalletters(String string){
        String ans="";
        boolean flip= true;
            for (int j = 0; j < string.length(); j++) {
                flip= true;
                char currentChar = string.charAt(j);
                if(((currentChar >= 'a' && currentChar <= 'z') ) && j==0){
                    ans+=((char) (currentChar - 32));
                }else if(currentChar >= 'A' && currentChar <= 'Z') {
                    ans += (char) (currentChar + 32);
                }else if (flip) {
                    ans+=currentChar;
                }
            }
    return ans;
}

static public boolean ifTheFirstCap(String ans){
    return (  ans.charAt(0) < 'a');
}
}