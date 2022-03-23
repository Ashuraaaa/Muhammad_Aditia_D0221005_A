import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int element = sc.nextInt();
            list.add(element);
        } 
        
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String query = sc.next();
            if(query.equals("Delete")){
                int x = sc.nextInt();
                list.remove(x);
            }else if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();//volue yang ditambahkan 
                list.add(x, y);
            }
        } 
        //cetek
        for(int volue : list){
            System.out.print(volue+" ");
        }
    }  
}