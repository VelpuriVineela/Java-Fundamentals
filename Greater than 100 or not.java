import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean res = false;
        if(n > 100){
            res = true;
        }
        System.out.println(res);
    }
}
