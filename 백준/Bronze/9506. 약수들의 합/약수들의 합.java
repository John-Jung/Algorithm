import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



       while (true) {

           int N = Integer.parseInt(br.readLine());
           StringBuilder sb = new StringBuilder();

           if(N == -1) break;

           int sum = 1;
           sb.append(N + " = 1");
           for(int  i = 2; i < N; i++){

                    if(N % i == 0) {
                        sb.append(" + " + i);
                        sum += i;
                    }
            }
           if(sum == N){
               System.out.println(sb);
           }else {
               System.out.println(N + " is NOT perfect.");
           }
       }
    }
}