/*
[ 문제 ]
- 한수는 지금 (x, y)에 있다. 
- 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
- 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

[ 입력 ]
- 첫째 줄에 x, y, w, h가 주어진다.

[ 출력 ]
- 첫째 줄에 문제의 정답을 출력한다.
*/
import java.util.Scanner;

public class no1085_escapeRect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] curPos = new int[2];
        int[] rect = new int[2];

        for(int i=0; i<curPos.length; i++){
            curPos[i] = sc.nextInt();
        }

        for(int i=0; i<rect.length; i++){
            rect[i] = sc.nextInt();
        }

        System.out.println();
        int result = curPos[0];

        if(result > Math.abs(curPos[0]-rect[0]))
            result = Math.abs(curPos[0]-rect[0]);
        if(result > curPos[1])
            result = curPos[1];
        if(result > Math.abs(curPos[1]-rect[1]))
            result = Math.abs(curPos[1]-rect[1]);

        System.out.println(result);
        sc.close();
    }
}