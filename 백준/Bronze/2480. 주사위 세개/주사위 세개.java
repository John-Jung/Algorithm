import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //개행으로 받기
//        int A = Integer.parseInt(br.readLine());

        //한줄로 받기
//        StringTokenizer st = new StringTokenizer(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B && B == C){
            System.out.println(10000 + A * 1000);
        }
        else if (A == B || A == C) {
            System.out.println(1000 + A * 100);
        }
        else if (B == C) {
            System.out.println(1000 + B * 100);
        }
        else {
            System.out.println(Math.max(A,Math.max(B,C)) * 100);
        }
    }
}