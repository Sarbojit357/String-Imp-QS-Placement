import java.util.*;
public class nonrep {
    public static void main(String[] args) {
        String str = "AABCDBE";

        for(int i =0; i<str.length(); i++){
            boolean unique = true;
            for(int j = 0; j<str.length(); j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    unique = false;
                }
            }
            if(unique) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
