import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());


        int n3 = B%10;//1의 자릿수
        int n4 = B%100 - B%10;//10의 자릿수
        int n5 = B/10;//38
        int n6 = n5 - n5%10;//38 -8
        int n7 = 10 * n6;//300


        System.out.println(A * n3);
        System.out.println(A * n4 / 10);
        System.out.println(A * n7/ 100);
        System.out.println(A * B);

    }
}