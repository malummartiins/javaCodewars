package progJava;

import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String [] answers = {"c","a","b"};
        String [] responses = {"","",""};


       System.out.println("Quanto é 2+2?"); 
       System.out.println("a) 2"); 
       System.out.println("b) 3"); 
       System.out.println("c) 4"); 
       System.out.println("d) 5"); 

       System.out.println("Qual é a capital do Rio Grande do Sul?"); 
       System.out.println("a) Porto Alegre"); 
       System.out.println("b) Florianópolis"); 
       System.out.println("c) Caxias do Sul"); 
       System.out.println("d) Curitiba");

       System.out.println("Qual o animal mais rápido?"); 
       System.out.println("a) Tigre"); 
       System.out.println("b) Pantera"); 
       System.out.println("c) Girafa"); 
       System.out.println("d) Lobo");

       responses[0] = scan.next();
       responses[1] = scan.next();
       responses[2] = scan.next();

        int score = 0;

       for (int i =0; i<3; i++){
        if (responses[i].equalsIgnoreCase(answers[i])){
            score++;

        }
       }
       System.out.println("Score: "+ score + "/3");
    }
}
