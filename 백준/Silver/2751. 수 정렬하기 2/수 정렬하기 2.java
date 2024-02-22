import java.util.*;
import java.io.*;

public class Main {

    static int dp[][] = new int[30][30];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int arr[] = new int [T];

        for(int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int value: list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}