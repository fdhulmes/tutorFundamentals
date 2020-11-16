public class TroughFactory {

    public static FeedingTrough makeTrough(Integer numSeeds, Integer numApples){
        return new FeedingTrough(numSeeds, numApples);
    }
}
