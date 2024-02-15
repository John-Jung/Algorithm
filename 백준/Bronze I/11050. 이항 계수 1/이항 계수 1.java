import java.util.*;
import java.io.*;


public class Main {

    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        // n C r = n! / (n-r)! r!
        System.out.println(f(N) / (f(N-R) * f(R)));
    }
    static int f(int n) {
        if(n<=1) return 1;
        return n * f(n-1);
    }
}

