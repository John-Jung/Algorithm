import java.util.*;
import java.io.*;

public class Main{

    public static boolean prime[];

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i <= Math.sqrt(N); i++){//또는 i *i <= N
            while(N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if( N != 1) {
            System.out.println(N);
        }
    }
}