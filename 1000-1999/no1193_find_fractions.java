/*
< 문제 >
 - 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
    1/1	1/2	1/3	1/4	1/5	…
    2/1	2/2	2/3	2/4	…	…
    3/1	3/2	3/3	…	…	…
    4/1	4/2	…	…	…	…
    5/1	…	…	…	…	…
    …	…	…	…	…	…
 - 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 - X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

< 입력 >
 - 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

< 출력 >
 - 첫째 줄에 분수를 출력한다.
*/
import java.util.Scanner;

public class no1193_find_fractions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n, seq, num, den;

        n = 1;
        seq = x;
        while(seq > n){
            seq -= n;
            n++;
        }

        num = FindNum(n, seq);
        den = FindDen(n, seq);

        System.out.println(num + "/" + den);
    }
    
    public static int FindNum(int n, int seq){   
        if(n%2 == 0)
            return seq;
        else   
            return n - seq + 1;

    }

    public static int FindDen(int n, int seq){
        if(n%2 == 0)
            return n - seq + 1;
        else   
            return seq;
    }
}