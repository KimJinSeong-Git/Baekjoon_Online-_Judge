/*
< 문제 >
 - N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

< 입력 >
 - 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

< 출력 >
 - 입력으로 주어진 숫자 N개의 합을 출력한다.
*/
import java.util.Scanner;

public class no11720_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nb_num = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();
        System.out.println("입력완");

        System.out.println(Sum(nb_num, num));
    }

    public static int Sum(int nb_num, String num){
        int sum = 0;

        for(int i=0; i<nb_num; i++){
            System.out.println(i + " num = " + ((int)num.charAt(i)-48));
            sum += (int)num.charAt(i)-48;
        }

        return sum;
    }
}