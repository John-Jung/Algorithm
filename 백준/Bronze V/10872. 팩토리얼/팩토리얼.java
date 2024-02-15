import java.util.*;
import java.io.*;


public class Main {

    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = f(N);
        System.out.println(sum);
    }
    static int f(int n) {
        if(n<=1) return 1;
        return n * f(n-1);
    }
}

