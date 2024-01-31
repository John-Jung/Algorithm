import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double max = Double.MIN_VALUE;
        int N = Integer.parseInt(br.readLine());
        double subject[] = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N ; i++){
            subject[i] = Integer.parseInt(st.nextToken());
            if(subject[i] > max){
                max = subject[i];
            }
//            System.out.println("subject:  " + subject[i] + "max: " + max);
        }
//        System.out.println( subject[0] / max * 100);
        double sum = 0;
        for(int i = 0; i < N ; i++){
            subject[i] = subject[i] / max * 100;
            sum += subject[i];
 //           System.out.println("subject:  " + subject[i] + "max: " + max);
        }
        System.out.println(sum/N);
    }
}