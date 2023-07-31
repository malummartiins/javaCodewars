/*Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) 
that receive a list of integers as input, and return the largest and lowest number in that list, respectively. */

public class MaxAndMin {

    public int min(int[] list) {
        int min = list [0];
        for (int i = 1; i < list.length; i++)
          if (min > list[i]) min = list [i];
          return min;
        
      }
      
      public int max(int[] list) {
        int max = list [0];
        for (int i = 1; i < list.length; i++)
          if (max < list[i]) max = list[i];
          return max;
        
      }
    }
