import java.util.*;
public class removechar {
    public static void main(String[] args) {
        String str = "opntext";
        char charToReplace = 't';
        if(str.indexOf(charToReplace) == -1){
            System.out.println("Given character is not available in input string");
            System.exit(0);
        }
       int cnt = 1;
       StringBuilder result = new StringBuilder();
       for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)== charToReplace){
                result.append(cnt);
                cnt++;
            }
            else{
                result.append(str.charAt(i));
            }
       }
       System.out.println(result.toString());
    }
}
