/*
< 문제 >
 - 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

< 입력 >
 - 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

< 출력 >
 - 첫째 줄부터 차례대로 별을 출력한다.
*/
import java.util.Scanner;

public class no10996_star21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);        
        int N;

        N = scan.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(j % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            for(int k=0; k<N; k++){
                if(k % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}