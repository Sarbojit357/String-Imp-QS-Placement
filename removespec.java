import java.util.*;
public class removespec {
    public static void main(String[] args) {
        String str = "@!$%&*st@$%rutrfy&*#!";
       
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
