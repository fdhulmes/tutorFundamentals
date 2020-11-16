public class Bird extends Animal {
    private Integer seedsEaten;

    public Bird(){

    }

    public Bird(String inputName, Integer inputAge){
        super(inputName, inputAge);
        this.seedsEaten = 0;
    }

    public Bird(String inputName){
        this(inputName, 0);
    }

    public Bird(Integer inputAge){
        this("Toucan Sam", inputAge);
    }


    public String speak(){
        return this.name;
    }

    public String getName(){
        return "stupid bird";
    }

    public void eatFood(FeedingTrough trough) {
        boolean hasEaten = trough.eatSeed();
        if(hasEaten){
            seedsEaten++;
            System.out.println(this.name + " has eaten a seed!");
        }
        else{
            System.out.println(this.name + " is gonna starve");
        }

    }
}
