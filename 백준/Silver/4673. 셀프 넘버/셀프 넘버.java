import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean check [] = new boolean[10001]; //1부터 10000이므로

        for(int i = 1; i < 10001; i++) {
            int n = d(i);

            if(n < 10001) {
                    check[n] = true;
            }
        }

        for(int i = 1; i < 10001; i++) {
            if(!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static int d(int number) {
     int sum = number;

         while(number != 0) {
             sum = sum + (number % 10); //첫 째 자리수
             number = number / 10; //10을 나누어 첫 째 자리를 없앤다
         }
         return sum;
    }
}
