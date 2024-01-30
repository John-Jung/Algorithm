import java.util.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] student = new int[31];


      for(int i =1; i < 29; i++){
          int A = Integer.parseInt(br.readLine());
          student[A] = 1;
      }

      for(int i = 1; i < 31; i++){
          if(student[i] != 1){
              System.out.println(i);
          }
      }
    }
}