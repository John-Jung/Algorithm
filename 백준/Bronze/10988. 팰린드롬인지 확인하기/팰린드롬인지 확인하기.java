import java.util.*;
import  java.io.*;

public class Main{

    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        int ans = 1;

        for(int  i = 0; i < s.length() / 2; i ++){
            if(s.charAt(i) != sb.charAt(i)){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}