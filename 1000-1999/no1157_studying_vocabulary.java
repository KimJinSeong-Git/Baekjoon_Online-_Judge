/*
< 문제 >
 - 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

< 입력 >
 - 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

< 출력 >
 - 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
import java.util.Scanner;

public class no1157_studying_vocabulary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int[] nb_Alphabet = new int[26];
        int result;

        for(int i=0; i<word.length(); i++){
            nb_Alphabet[i] = HowManyAlphabet(word, i);
        }
        result = MostAlphabet(nb_Alphabet);
        System.out.println(result);

        if(result > 0)
            System.out.println((char)result);
        else
            System.out.println('?');
        sc.close();

    }

    public static int HowManyAlphabet(String word, int order){
        int small, capital, character;
        int result = 0;

        small = order+97;
        capital = order+65;

        for(int i=0; i<word.length(); i++){
            character = (int)word.charAt(i);

            if(character == small || character == capital)
                result++;
        }

        return result;
    }

    public static int MostAlphabet(int[] nb_alphabet){
        int result = 0;
        int cnt = 0;

        for(int i=1; i<26; i++){
            if(nb_alphabet[i-1] < nb_alphabet[i])
                result = i;
        }

        for(int i=0; i<26; i++){
            if(nb_alphabet[result] == nb_alphabet[i])
                cnt++;
        }

        if(cnt > 1)
            return -1;

        return result + 65;
    }
}