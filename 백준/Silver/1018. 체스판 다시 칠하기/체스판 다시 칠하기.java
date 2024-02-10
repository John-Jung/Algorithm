import java.io.*;
import java.util.*;

public class Main {
    public static int arr [][] = new int[55][55];
    public static int board1 [][] = new int[8][8];
    public static int board2 [][] = new int[8][8];

    public static int ans;

    public static void sol (int a, int b) {
        int tmp1, tmp2;
        tmp1  = tmp2  = 0;
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(arr[a +i][b + j] != board1[i][j]) tmp1++;
                if(arr[a +i][b + j] != board2[i][j]) tmp2++;
            }
        }
        ans = Math.min(tmp1, ans);
        ans = Math.min(tmp2, ans);
    }

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ans = 64;


        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < n; i++) {
            String s = br.readLine();
            for(int j  = 0; j < m; j++) {
                if(s.charAt(j) == 'B') arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }

        for(int i = 0; i < 8; i++) {//W board B board 초기화
            for(int j = 0; j < 8; j++) {
                board1[i][j] = (i + j + 1) % 2;
                board2[i][j] = (i + j) % 2;
            }
        }


        for(int i = 0; i + 8 <= n; i++) {
            for(int j = 0; j + 8 <= m; j++) {// i,j는 시작점 8 * 8확인할거임
                sol(i,j);
            }
        }
            System.out.println(ans);
    }
}
