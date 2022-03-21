import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]A= new int[n];
        for (int i=0;i<n;i++){
            A[i]=scanner.nextInt();
        }
        
        int nNegativeSum = 0;
       for(int i=0;i<A.length;i++){//start
            for(int j=i;j<A.length;j++){//end
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += A[k]; 
                }
                if(sum<0){
                    nNegativeSum++; 
                }
                //System.out.println(" = "+sum);
            }
       }   
    System.out.println(nNegativeSum);            
    }
}