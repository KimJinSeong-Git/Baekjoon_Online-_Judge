/*
< 문제 >
 - 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

< 입력 >
 - 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

< 출력 >
 - 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*/

import java.util.Scanner;

public class no2523_star13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int nb_Star = 0;
        int sw = 1;

        for(int i=0; i < 2*N-1; i++){
            if(nb_Star == N)
                sw = -1;

            nb_Star = nb_Star + sw;

            System.out.println("*".repeat(nb_Star));
        }
        scanner.close();
    }
}