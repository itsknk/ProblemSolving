import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n = arr.length;
        double pos=0,neg=0,zer=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0)
                pos++;
            if(arr[i]<0)
                neg++;
            if(arr[i]==0)
                zer++;
        }
        double a = (double)Math.round(pos/n * 1000000d) / 1000000d;
        double b = (double)Math.round(neg/n * 1000000d) / 1000000d;
        double c = (double)Math.round(zer/n * 1000000d) / 1000000d;

       System.out.println(a);
       System.out.println(b);
       System.out.println(c);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
