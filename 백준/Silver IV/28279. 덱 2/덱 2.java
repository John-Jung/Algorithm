import java.util.*;
import java.io.*;

public class Main {


    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1" : dq.addFirst(Integer.parseInt(st.nextToken())); break;
                case "2" : dq.addLast(Integer.parseInt(st.nextToken())); break;
                case "3" : sb.append(!dq.isEmpty() ? dq.pollFirst() : -1).append('\n'); break;
                case "4" : sb.append(!dq.isEmpty() ? dq.pollLast() : -1).append('\n'); break;
                case "5" : sb.append(dq.size()).append("\n"); break;
                case "6" : sb.append(dq.isEmpty() ? 1: 0).append("\n"); break;
                case "7" : sb.append(!dq.isEmpty() ? dq.getFirst() : -1).append("\n"); break;
                case "8" : sb.append(!dq.isEmpty() ? dq.getLast() : -1).append("\n"); break;



            }
        }
            System.out.println(sb.toString());
    }//main 함수 마지막
}