import java.util.*;
import java.io.*;
public class staircase
{
public static void main(String args[])
{
  int n=4;
  for(int i=1; i<=n; i++){
    for(int j=n; j>=i; j--)
    {
      //if(i+j==n+1||i+j==n+2||i+j==n+3||i+j==n+4)
      System.out.print("*");
    }
    System.out.println();
  }
}
}
