import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args)throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int A = Integer.parseInt(br.readLine());
       int B = Integer.parseInt(br.readLine());
       int C = Integer.parseInt(br.readLine());
       int sum = A  + B + C;

       if(sum == 180) {
           if(A == B && B ==C){
               System.out.println("Equilateral");
           } else if (A == B || A == C) {
               System.out.println("Isosceles");
           }else if (B == C) {
               System.out.println("Isosceles");
           }else {
               System.out.println("Scalene");
           }
       }else {
           System.out.println("Error");
       }



    }
}