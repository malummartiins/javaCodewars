package progJava;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class WPMProgram {
    

    static String[] words = { "envelope", "dev", "livros", "cachorro", "bolacha", "café", "chocolate", "praia", "sol",
            "estudos" };

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner (System.in);

        while(true){
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);

        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            System.out.print(words[rand.nextInt(9)] +" ");
        }

        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        
        String typedWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        int numChars = typedWords.length();

        //fórmula de palavras por minuto ( x characters/ 5 / 1min = y WPM)
        int wpm = (int) (((double)numChars / 5 / seconds) * 60);
    
        System.out.println("Your WPM is " + wpm);
        System.out.println();
        
         System.out.println("Jogar de novo? [S/N]");
            String playAgain = scan.nextLine();

            if (!playAgain.equals("s")) {
                break;
            }
    }
       
    }
}
