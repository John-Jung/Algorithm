import java.util.*;
import java.io.*;

public class Main {


    static Stack<Integer>stack = new Stack<>();


    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int K = Integer.parseInt(br.readLine());

       for(int i = 0; i < K; i++) {
           int input = Integer.parseInt(br.readLine());

           if(input == 0) {
               stack.pop();
           }
           else {
               stack.push(input);
           }
       }

//       System.out.println(stack);
       int sum = 0;
//        System.out.println(stack.size());
       for(int i = 0; i < stack.size(); i++) {
           sum += stack.get(i);
       }
        System.out.println(sum);
    }
}