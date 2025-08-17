//Reverse each word in given string
// Input : "java code"
// Output : "avaj code" 

import java.util.*;
public class reverse2{
    public static void main(String[] args) {
        String str = "java code";
        String[] words = str.split(" ");  // split into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);   // reverse using charAt
            }
            result.append(rev).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
