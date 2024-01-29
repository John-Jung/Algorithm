import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 빠른 출력
        //개행으로 받기
//        int A = Integer.parseInt(br.readLine());

        //한줄로 받기
//        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer>list = new ArrayList<>();
        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++) {

            int A = Integer.parseInt(br.readLine());
            list.add(A);
            if(max < list.get(i)){
                max = list.get(i);
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);




    }
}