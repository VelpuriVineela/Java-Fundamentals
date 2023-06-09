import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sem = new Scanner(System.in);
        
        int x = sem.nextInt();
        int y = sem.nextInt();
        int z = sem.nextInt();
        
        System.out.println((x+y+z)<150);
    }
}
