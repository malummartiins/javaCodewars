/*Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.

 */

import java.util.Arrays;
import java.util.List;

public class Trolls {
    public static String disemvowel(String str){
        Character vogais [] = {'a','e','i','o','u', 'A','E','I','O','U'};
        List <Character> al = Arrays.asList(vogais);

        StringBuffer teste = new StringBuffer(str);

        for (int i =0; i<teste.length();i++){
            if (al.contains(teste.charAt(i))){
                teste.replace(i, i+1,"");
                i--;
            }
        }
        return teste.toString();

    }
}

=========================================
//OUTRA FORMA MORE EASY
public class Trolls {
    public static String disemvowel(String str){
        return str.replaceALL("[aAeEiIoOuU]", "");
    }
}
