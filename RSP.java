package JC.Day56;

import java.util.Random;
import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        
            System.out.print("가위,바위,보 중 하나를 선택하세요.(가위=a, 바위=b, 보=c):");
            
            
            String userinput = sc.next(); 
            int comnum = rd.nextInt(3);
            String cominput = " ";
       

            switch (comnum) {
                case 0: cominput= "a"; break;
                case 1: cominput = "b"; break;
                case 2: cominput = "c"; break;
                default:break;
            }

           
            int userint = 1;
            int comint = 1;

            String a = "a"; String b = "b"; String c = "c";

            if (userinput.equals(a)) {userinput="가위"; userint = 0;} 
            else if (userinput.equals(b)) {userinput="바위"; userint = 1;} 
            else if (userinput.equals(c)) {userinput="보"; userint = 2; }
        
            if(cominput.equals(a)) {cominput = "가위";comint = 0;}
            else if(cominput.equals(b)) {cominput = "바위";comint = 1;}
            else if(cominput.equals(c)) {cominput = "보";comint = 2;}

            // System.out.println(userinput);
            // System.out.println(cominput);
            // System.out.println(userint);
            // System.out.println(comint);

            

             if (userint==comint) {System.out.printf("무승부(컴퓨터 : %s, 사람: %s)", cominput,userinput);}
             
             else if(userint>comint) {
                 
                if(userinput.equals("가위") && cominput.equals("보"))
                    System.out.printf("사람 승!(컴퓨터 : %s, 사람: %s)", cominput,userinput);
                else if(userinput.equals("보") && cominput.equals("바위"))
                    System.out.printf("사람 승!(컴퓨터 : %s, 사람: %s)", cominput,userinput);  
                else if(userinput.equals("바위") && cominput.equals("가위"))
                    System.out.printf("사람 승!(컴퓨터 : %s, 사람: %s)", cominput,userinput);
            }  

                
            else if(userint<comint) {
                 
                if(cominput.equals("가위") && userinput.equals("보"))
                    System.out.printf("컴퓨터 승!(컴퓨터 : %s, 사람: %s)", cominput,userinput);
                else if(cominput.equals("보") && userinput.equals("바위"))
                    System.out.printf("컴퓨터 승!(컴퓨터 : %s, 사람: %s)", cominput,userinput);  
                else if(cominput.equals("바위") && userinput.equals("가위"))
                    System.out.printf("컴퓨터 승!(컴퓨터 : %s, 사람: %s)", cominput,userinput);
            }  
            
    }
}
