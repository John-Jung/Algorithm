import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //개행으로 받기
//        int A = Integer.parseInt(br.readLine());

        //한줄로 받기
//        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < n + 1; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}