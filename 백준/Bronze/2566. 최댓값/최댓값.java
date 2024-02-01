import javax.swing.*;
import java.util.*;
import  java.io.*;

public class Main{


    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr [][] = new int [9][9];
        int max = Integer.MIN_VALUE;
        int x = 1,y = 1;

        for(int i  = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }

//               System.out.println("max: " + max);
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);

//        for(int i  = 0; i < 9; i++){
//            for(int j = 0; j < 9; j++) {
//                System.out.print(arr[i][j] + " ");
//            }System.out.println();
//        }

    }
}