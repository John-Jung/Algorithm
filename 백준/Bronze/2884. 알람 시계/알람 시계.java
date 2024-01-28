import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int A = Integer.parseInt(br.readLine());//개행으로 받기
//        int B = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());// 한줄로 받기

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        M -= 45;

        if(M < 0){
            H -= 1;
            M += 60;
            if(H < 0){
                H += 24;
            }
        }
        System.out.println(H + " " + M);

    }
}