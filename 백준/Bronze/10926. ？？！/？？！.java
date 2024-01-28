import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st  = new StringTokenizer(br.readLine());
       // System.out.println(st.countTokens());
        for(int i=0; i < st.countTokens(); i++){
            System.out.print(st.nextToken());

        }System.out.println("??!");
    }
}