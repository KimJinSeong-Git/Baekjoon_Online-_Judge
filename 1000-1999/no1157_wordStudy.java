/*
[ 문제 ]
- 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
- 단, 대문자와 소문자를 구분하지 않는다.

[ 입력 ]
- 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
- 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

[ 출력 ]
- 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
- 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
import java.util.*;

public class no1157_wordStudy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String strInput = new String(sc.next());
        MostUsedCharacter MUC = new MostUsedCharacter(strInput);
        System.out.println(MUC.mostUsedChar());

        sc.close();
    }
}

class MostUsedCharacter{
    // Member Variables
    private String strWord;
    private int[] nbUsed = new int[26];
    private int mostUsed = 0;

    // Constructor
    public MostUsedCharacter(String strInput){
        this.strWord = new String(strInput);
    }

    // Member Methods
    public void checkMost(){
        for(int i=0; i<this.strWord.length(); i++){
            int ascii = strWord.charAt(i);

            if(ascii >= 65 && ascii <=90)
                ascii = ascii-65;
            else if(ascii >= 97 && ascii <=122)
                ascii = ascii-97;
            
            this.nbUsed[ascii]++;
        }

        for(int i=0; i<nbUsed.length; i++){
            if(nbUsed[mostUsed] < nbUsed[i])
                this.mostUsed = i;
        }
    }

    public char mostUsedChar(){
        this.checkMost();

        int nbMost = this.nbUsed[this.mostUsed];
        for(int i=mostUsed+1; i<nbUsed.length; i++){
            if(nbUsed[i] == nbMost)
                return '?';
        }
        return (char)(this.mostUsed+65);
    }
}
