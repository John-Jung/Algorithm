import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       ArrayList<Integer>list = new ArrayList<>();

       for(int i = 0; i < N; i++){
        list.add(i + 1);
       }

       

       for(int i = 0; i < M; i++){
           StringTokenizer st2 = new StringTokenizer(br.readLine());

           int A = Integer.parseInt(st2.nextToken()) - 1;
           int B = Integer.parseInt(st2.nextToken()) - 1;
           int temp = list.get(A);

           list.set(A,list.get(B));
           list.set(B,temp);


       }

       for(int i = 0; i < N; i++){
           System.out.print(list.get(i) + " ");
       }

    }
}