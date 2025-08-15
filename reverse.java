import java.util.*;

public class reverse{
    public static void main(String[] args) {
        String str = "hello";

        //Approach 1
        int length = str.length();
        char[] ch = str.toCharArray();
        for(int i = length-1; i>=0; i--){
            System.out.print(ch[i]);
        }

        //Approach 2
        for(int i = length-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        //Approach 3
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());


        //Approach 4
        StringBuilder sb2 = new StringBuilder(str);
        System.out.print(sb2.reverse());
    }
}