import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int alphabet [] = new int[26];

        for(int i  = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++){
 //           System.out.print(s.charAt(i) + " ");
            int N = s.charAt(i) - 'a';
            if(alphabet[N] == -1){
                alphabet[N] = i;
            }
//            System.out.print(N + " ");

        }

        for(int i  = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}