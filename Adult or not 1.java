import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sem = new Scanner(System.in);
        
        int age = sem.nextInt();
        
        if(age >= 18){
            
            System.out.println("Adult");
        }
            
        else {
            
            System.out.println("Below age");
            
        }
        
    }
}
