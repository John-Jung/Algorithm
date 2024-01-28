import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int A = Integer.parseInt(br.readLine());//개행으로 받기
//        int B = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());// 한줄로 받기

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        B += C;

        while(B >= 60) {
            A += 1;
            B -= 60;

            if(B < 60){
                break;
            }
        }
        if (A >= 24) {
            A = A -24;
        }
        System.out.println(A + " " + B);
    }
}