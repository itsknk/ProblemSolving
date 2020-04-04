import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double a = in.nextDouble();
             double b = in.nextDouble();
              double n = in.nextDouble();
            double sum =a;
            for(double j=0;j<n;j++)
            {
                sum=sum+(Math.pow(2,j))*b;
               int q=(int)sum;
                System.out.print(q+" ");
            }
            System.out.println("");
        }
        in.close();

    }
}
