import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args)throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int side[] = new int [3];

       while(true) {
           st = new StringTokenizer(br.readLine());
           side[0] = Integer.parseInt(st.nextToken());
           side[1] = Integer.parseInt(st.nextToken());
           side[2] = Integer.parseInt(st.nextToken());

           Arrays.sort(side);

           if(side[0] == 0 && side[1] == 0 && side[2] ==0) break;
//!(side[0] + side[1] >= side[2])
           if(side[0] + side[1] <= side[2]){
               System.out.println("Invalid");
           } else if(side[0] == side[1] && side[1] == side[2]) {
               System.out.println("Equilateral");
           } else if(side[0] == side[1] || side[1] == side[2] || side[0] == side[2]) {
               System.out.println("Isosceles");
           } else {
               System.out.println("Scalene");
           }

       }


    }
}