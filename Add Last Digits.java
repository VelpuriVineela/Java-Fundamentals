import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        System.out.println(lastDigit1 + lastDigit2);
    }
}
