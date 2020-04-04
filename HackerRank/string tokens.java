import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s == null || s.equals("") || s.trim().equals("")){
       System.out.println("0");
          }
        else{
        String [] values= s.trim().split("[ !,?.\\_'@]+");
        System.out.println(values.length);
        for(int i=0;i<values.length;i++){
        System.out.println(values[i]);}
        }
        scan.close();
    }
}
