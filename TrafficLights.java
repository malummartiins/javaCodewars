/*You're writing code to control your town's traffic lights. You need a 
function to handle each change from green, to yellow, to red, and then 
to green again.

Complete the function that takes a string as an argument 
representing the current state of the light and returns a string 
representing the state the light should change to.

For example, when the input is green, output should be yellow. */

import java.util.Arrays;

public class TrafficLights {

  public static String updateLight(String current) {

    switch (current){
        case "red": return "green";
        case "yellow": return "red";
        case "green": return "yellow";
        default: throw new IllegalArgumentException();
    }
    int[] a = {1,2,3,4};
    Arrays.sort(a);
  }
}
