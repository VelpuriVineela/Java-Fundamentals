import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
