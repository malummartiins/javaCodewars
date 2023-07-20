public class SpinWords {

  public String spinWords(String sentence) {
    StringBuilder inverte = new StringBuilder();
    String [] splitSentence = sentence.split(" ");
    
    for (String word : splitSentence) {
      if (word.length() > 4) {
        inverte.append(new StringBuilder(word).reverse().toString() + " ");
      } else {
        inverte.append(word + " ");
      }
    }
    return inverte.toString().trim();
  }
}

/* Write a function that takes in a string of one or more words, and returns the same string, but 
with all five or more letter words reversed (Just like the name of this Kata). Strings passed in willconsist of only 
letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
spinWords( "This is a test") => returns "This is a test" 
spinWords( "This is another test" )=> returns "This is rehtona test"*/