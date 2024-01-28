import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int A = Integer.parseInt(br.readLine());//개행으로 받기
//        int B = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());// 한줄로 받기

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(A + B + C);
    }
}