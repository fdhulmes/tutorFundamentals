import java.util.ArrayList;

public class FeedingTrough {
    private Integer numberSeeds;
    private Integer numberApples;

    public FeedingTrough(Integer numberSeeds, Integer numberApples){
        this.numberApples = numberApples;
        this.numberSeeds = numberSeeds;
    }

    public boolean eatSeed(){
        if(numberSeeds > 0){
            numberSeeds--;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean eatApple(){
        if(numberApples > 0){
            numberApples--;
            return true;
        }
        else{
            return false;
        }
    }


}
