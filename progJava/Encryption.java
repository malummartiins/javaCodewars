public class Encryption {
    //key é uma pequena informação
    /*exemplo do que farei: 
     * MALU- é a msg
       NBMV -- é a msg em codigo
       -1 é a lógica de subtrair da letra pra ter 
       a letra seguinte */

       public static void main(String[] args) {
        String text = "Hey, how's it hangin?";

         System.out.println(text); //msg original
        
        char [] chars = text.toCharArray();

        for (char c : chars){
            c += 5;
            System.out.print(c); //criptografada
        }

       }
}
