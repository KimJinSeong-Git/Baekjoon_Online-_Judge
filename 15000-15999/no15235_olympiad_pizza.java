/*
[ 문제 ]
- 올림피아드 결승전 동안 우리는 보통 참가자들에게 피자를 제공합니다. 
- 음식이 도착하면 참가자들은 피자를 먹기 위해 줄을 섭니다. 각 학생은 자신의 차례가 되면 피자 한 조각을 받게 됩니다. 
- 문제는 어떤 사람들은 잘 먹으려면 한 조각 이상의 피자가 필요하기 때문에 첫 번째 피자를 받은 후 더 많은 피자를 얻기 위해 다시 줄을 서야 한다는 것입니다.

- 각 참가자에게 음식을 제공하는 데 필요한 조각 목록이 주어지면 모든 참가자에게 음식을 제공하는 데 걸리는 시간을 계산하십시오. 
- 우리는 매초 피자 한 조각을 줄 수 있으며 참가자가 충분히 배부르면 대기열로 돌아가지 않습니다.

[ 입력 ]
- 첫 번째 줄에는 정수 N이 포함됩니다. 
- 참가자 수입니다.

- 두 번째 줄에는 공백으로 구분된 N개의 정수가 포함됩니다. 
- 각 참가자를 먹이는 데 필요한 피자 조각의 수입니다.

N <= 1000

- 시퀀스의 숫자는 1에서 1000 사이입니다.

- 각 참가자는 최소 1조각에서 최대 100조각의 피자가 필요합니다.

[ 출력 ]
- 공백으로 구분된 N개의 정수를 포함하는 행. 
- 각 참가자가 필요한 모든 조각을 얻는 시간.
*/
import java.util.*;

public class no15235_olympiad_pizza {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nbPart = sc.nextInt();
        int[] nbPizza = new int[nbPart];
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<nbPart; i++){
            int temp = sc.nextInt();
            nbPizza[i] = temp;
        }

        while(Arrays.stream(nbPizza).sum() > 0){
            for(int i=0; i<nbPart; i++){
                if(nbPizza[i] > 0){
                    nbPizza[i]--;
                    queue.offer(i);
                }
            }
        }

        int elapsedTime=0;
        while(queue.peek() != null){
            elapsedTime++;
            nbPizza[queue.poll()] = elapsedTime;
        }

        for(int i=0; i<nbPart; i++){
            System.out.print(nbPizza[i] + " ");
        }
        
        sc.close();
    }
}
