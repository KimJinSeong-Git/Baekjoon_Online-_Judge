/*
< 문제> 
 - 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

< 입력 >
 - 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

< 출력 >
 - 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
*/
import java.util.Scanner;

public class no1065_hansu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;

        for(int i=1; i<=num; i++){
            if(IsHansu(i)==true)
                cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }

    public static boolean IsHansu(int num){
        int d = num%10 - (num/10)%10;
        int temp;

        if(num<100)
            return true;

        while(num!=0){
            temp = num%10;
            //System.out.println("Temp : " + temp);
            //System.out.println("Num : " + num % 10);
            //System.out.println("d : " + d);
            if(temp - num%10 != d){
                //System.out.println("FALSE");
                return false;
            }
            num = num/10;
        }
        return true;
    }
}
