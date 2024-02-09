import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args)throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      int h = Integer.parseInt(st.nextToken());

      int minx = 0, miny = 0, realmin = 0;

      if(w - x < x) {
          minx = w -x;
      }else {
          minx = x;
      }
      if(h - y < y) {
          miny = h - y;
      } else {
          miny = y;
      }
        realmin = Math.min(minx, miny);

      System.out.println(realmin);

    }
}