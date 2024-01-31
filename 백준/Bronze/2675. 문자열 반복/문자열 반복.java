import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());



//      System.out.print("R: " + R + " s: " + s);
        for(int a = 0; a < N; a++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

              for(int i = 0; i < s.length(); i++){
                  for(int j = 0; j < R; j++) {

                       System.out.print( s.charAt(i));

                  }
              }System.out.println();
        }

    }
}