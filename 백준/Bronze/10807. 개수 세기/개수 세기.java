import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 빠른 출력
        //개행으로 받기
//        int A = Integer.parseInt(br.readLine());

        //한줄로 받기
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V= Integer.parseInt(br.readLine());
        int count  = 0;
        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(st.nextToken());
            if(A == V){
                count++;
            }
        }
        System.out.println(count);
    }
}