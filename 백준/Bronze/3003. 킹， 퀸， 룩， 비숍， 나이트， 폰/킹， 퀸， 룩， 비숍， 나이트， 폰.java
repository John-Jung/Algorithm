import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int chess [] = {1,1,2,2,2,8};


       StringTokenizer st = new StringTokenizer(br.readLine());

       for(int i = 0; i < chess.length; i++){
           chess[i] -= Integer.parseInt(st.nextToken());
           System.out.print(chess[i] + " ");
       }


    }
}