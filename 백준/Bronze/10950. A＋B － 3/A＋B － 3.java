import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //개행으로 받기
//        int A = Integer.parseInt(br.readLine());

        //한줄로 받기
//        StringTokenizer st = new StringTokenizer(br.readLine());


        int T = Integer.parseInt(br.readLine());


        for(int i  = 0; i < T; i++ ) {
            StringTokenizer st = new StringTokenizer((br.readLine()));
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(A + B);
        }

    }
}