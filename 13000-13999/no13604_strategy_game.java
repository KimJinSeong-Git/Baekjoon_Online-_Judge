/*
[ 문제 ]
- 플레이어와 함께하는 전략 게임은 테이블 주위에서 진행됩니다. 첫 번째 플레이는 플레이어 1이고 두 번째 플레이는 플레이어 2입니다. 
- 라운드가 완료되면 플레이어 1이 다시 이동하고 플레이어의 명령이 다시 반복됩니다. 매 턴마다 플레이어는 일정량의 승점을 보장합니다. 
- 각 플레이어의 점수는 각 이동의 승점 합계로 구성됩니다.

- 플레이어 수, 라운드 수 및 획득한 승점을 나타내는 목록이 주어지면 어떤 플레이어가 승자인지 결정해야 합니다. 
- 한 명 이상의 플레이어가 가장 높은 점수를 얻은 경우 마지막에 플레이한 가장 높은 점수를 가진 플레이어가 승자가 됩니다.

[ 입력 ]
- 입력은 두 줄로 구성됩니다. 
- 첫 번째 줄은 두 개의 정수 J와 R, 각각 플레이어 수와 라운드 수(1 ≤ J, R ≤ 500)를 포함합니다. 
- 두 번째 줄에는 J × R 정수가 포함되며, 각 이동의 승점에 해당하는 순서대로 발생합니다. 
- 각 턴에서 획득하는 승점은 항상 0에서 100 사이의 정수입니다.

[ 출력 ]
- 프로그램은 승리한 플레이어에 해당하는 정수를 포함하는 한 줄을 생성해야 합니다.
*/
import java.util.*;

public class no13604_strategy_game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nPlayers = sc.nextInt();
        int nRounds = sc.nextInt();
        int[] score = new int[nPlayers];
        int bestPlayer = 0;

        for(int i=0; i<nPlayers*nRounds; i++){
            score[i%nPlayers] = score[i%nPlayers] + sc.nextInt();
        }

        for(int i=0; i<nPlayers; i++){
            if(score[bestPlayer]<=score[i])
                bestPlayer = i;
        }
        System.out.println(bestPlayer+1);
        sc.close();
    }
}