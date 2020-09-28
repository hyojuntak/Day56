package JC.Day56;

import java.util.Random;
import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Random rd = new Random();
 
        int ee = 0;


        do {
            int dan = 1+rd.nextInt(9);
            int gu = 1+rd.nextInt(9);
            System.out.printf("* 구구단 %d단에 대한 문제입니다.",dan);
            System.out.println();

            System.out.printf("%d * %d = ",dan, gu); int result = sc.nextInt();
            int answer = dan * gu;

            if (answer==result) {System.out.println("맞았습니다.1");} 
            else{System.out.println("틀렸습니다. 정답은 "+answer+"입니다.");}

            System.out.println("학습을 더 하시겠습니까? 1.Yes 2.No"); ee = sc.nextInt();
            
        } while (ee==1);
        
    }
}
