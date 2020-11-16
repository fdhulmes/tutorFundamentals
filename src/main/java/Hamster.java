public class Hamster extends Animal {
    private Integer applesEaten;

    public Hamster(){

    }

    public Hamster(String inputName, Integer inputAge){
        super(inputName, inputAge);
        this.applesEaten = 0;
    }

    public Hamster(String inputName){
        this(inputName, 0);
    }

    public Hamster(Integer inputAge){
        this("Toucan Sam", inputAge);
    }


    public void eatFood(FeedingTrough trough) {
        boolean hasEaten = trough.eatApple();
        if(hasEaten){
            applesEaten++;
            System.out.println(this.name + " has eaten an apple!");
        }
        else{
            System.out.println(this.name + " is gonna starve");
        }

    }

    public String getName(){
        return this.name;
    }
}
