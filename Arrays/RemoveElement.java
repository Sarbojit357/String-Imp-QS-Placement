// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {7,1,2,6,4};
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.print("Enter the index to the deleted : ");
        int index = sc.nextInt();
        if(index <= 0 || index > n){
            System.out.print("Invalid Position");
        } else{
            for(int i = index; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            for(int i = 0; i<n-1; i++){
                System.out.print(arr[i]);    
            }
        }
        
    }
}