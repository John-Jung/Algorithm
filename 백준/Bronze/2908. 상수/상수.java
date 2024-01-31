import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int rev1 = 0;
        int rev2 = 0;

        while(A != 0){
            rev1 = rev1 * 10 + (A % 10);
            A /= 10;
        }
//        System.out.println(rev1);

        while(B != 0){
            rev2 = rev2 * 10 + (B % 10);
            B /= 10;
        }

        int max = Math.max(rev1,rev2);
        System.out.println(max);



    }
}