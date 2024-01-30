import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        ArrayList<Integer>list = new ArrayList<>();

        int i,j,k;

        for(int x = 0; x < N; x++){
            list.add(0);
        }

            for(int y = 0; y < M; y++){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                i = Integer.parseInt(st2.nextToken());
                j = Integer.parseInt(st2.nextToken());
                k = Integer.parseInt(st2.nextToken());

                for( i -= 1; i <j ; i++){
                    list.set(i,k);
                }

            }

        for(int x = 0; x < N; x++){
            System.out.print(list.get(x) + " ");
        }


    }
}