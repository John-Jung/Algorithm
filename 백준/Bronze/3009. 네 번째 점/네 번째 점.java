import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args)throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st;

      int x_axis[] = new int[3]; //x좌표 3개를 입력받아서 저장할 배열
      int y_axis[] = new int[3];

      for(int i = 0; i < 3; i++){//3좌표 값만 받으니까 반복문 3번
          st = new StringTokenizer(br.readLine());
          //한줄씩 입력받아서 공백을 기준으로
          x_axis[i] = Integer.parseInt(st.nextToken());//앞은 x좌표
          y_axis[i] = Integer.parseInt(st.nextToken());//뒤는 y좌표
      }

      int x =  0; //찾아야할 x좌표 값을 저장하는 변수
      int y =  0; //찾아야할 x좌표 값을 저장하는 변수

        if(x_axis[0] == x_axis[1]) {//만약 x 0인덱스와 1인덴스가 같다면 2개 있다는 뜻임으로
            x = x_axis[2]; //0과 1인덱스가 아닌 2 인덱스를 저장
        }else { //0과 1인덱스와 x값이 다른데,
            //만약, x의 0인덱스와 2이덱스가 같으면 1인덱스 저장 그게 아니라면 0 인덱스를 저장
            x = (x_axis[0] == x_axis[2]) ? (x_axis[1]) : (x_axis[0]);
        }

        //y도 x와 마찬가지
        if(y_axis[0] == y_axis[1]) {
            y = y_axis[2];
        } else {
            y = (y_axis[0] == y_axis[2]) ? (y_axis[1]) : (y_axis[0]);
        }
        System.out.println(x + " " + y);
    }
}