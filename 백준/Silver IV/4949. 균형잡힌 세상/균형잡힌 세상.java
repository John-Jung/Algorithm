import java.util.*;
import java.io.*;

public class Main {

    static Stack<Character> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String s;

       while(true) {

           s = br.readLine();

           if(s.equals(".")) {
               break;
           }
                sb.append(solve(s)).append('\n');
       }

       System.out.println(sb);
    }// main 함수 마지막

    public static String solve(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i); //i 번째 문자

            //여는 괄호일 경우 스택에 push
            if(c == '(' || c == '[') {
                stack.push(c);
            }

            //닫는 소괄호 일 경우
            else if(c == ')') {

                //스텍이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
                if(stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if(c == ']') {
                //스텍이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우
                if(stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }

            //그 외의 경우에는 불필요한 문자들이기에 skip한다.
        }
        if(stack.isEmpty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }

}