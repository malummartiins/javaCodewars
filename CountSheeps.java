public class CountSheeps {
    
    public int CountSheeps (Boolean [] arrayOfSheeps){
        int counter = 0;
        for (Boolean present : arrayOfSheeps)
        if (present != null && present){
            counter +=1;
        }
    }
    return counter;

}
