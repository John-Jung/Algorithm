import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());// 한줄로 받기

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int ans = 0;
        int tmp = 1;

        for(int i = N.length() -1; i >=0; i--){
            char c = N.charAt(i);
            if('A' <= c && c <= 'Z'){
                ans += (c - 'A' + 10) * tmp;
            }
            else{
                ans += (c - '0') * tmp;
            }
            tmp  *= B;
//            System.out.println("tmp: " + tmp);
        }

        System.out.println(ans);
    }
}
