public class removewhite {
    public static void main(String[] args) {
        String str = " j a va s ta r  ";
        System.out.println(str.trim()); 
        // the trim method removes the spaces only from the first and last of a String

        System.out.println(str.replaceAll(" ", ""));
    }  
}
