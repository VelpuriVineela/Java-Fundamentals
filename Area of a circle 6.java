import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int diameter = scn.nextInt();
        int radius = diameter / 2;
        int Area=(22*radius*radius)/7;
        System.out.println(Area);
    }
}
