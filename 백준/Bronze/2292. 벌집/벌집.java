import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 1; //겹 수
        int range = 2;// 범위

        if(N == 1){
            System.out.println(1);
        }
        else{
            while(range <= N){
                range = range + (6* cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}