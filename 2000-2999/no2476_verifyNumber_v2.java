import java.util.Scanner;;

public class no2476_verifyNumber_v2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nbVerify = 0;

        for(int i=0; i<5; i++){
            nbVerify = nbVerify + (int)Math.pow(sc.nextInt(), 2);
        }

        System.out.println(nbVerify%10);
        sc.close();
    }
}
