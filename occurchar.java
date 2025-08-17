//Java Program To Find Occurrence Of Each Character

import java.util.*;
public class occurchar {
    public static void main(String[] args) {
        String str = "hello";
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char ch: chars) {
            if(!map.containsKey(ch)){
                map.put(ch,1);
            } else {
                int cnt = map.get(ch);
                map.put(ch, cnt+1);
            }
        }
        System.out.println(map);
    }
}
