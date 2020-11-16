import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){
        Bird tweety = new Bird("Tweety", 2);
        Hamster chester = new Hamster("Chester", 6);

        AnimalFarm orwellsFarm = new AnimalFarm();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tweety);
        animals.add(chester);
        animals.add(new Hamster("1"));
        animals.add(new Hamster("two"));
        animals.add(new Hamster("III"));
        animals.add(new Hamster("quatro"));

        FeedingTrough trough = TroughFactory.makeTrough(3, 2);

        for(Animal currentAnimal : animals){
            currentAnimal.eatFood(trough);
            orwellsFarm.addToFarm(currentAnimal);
        }

        System.out.println(orwellsFarm.getAnimalMap().get("stupid bird").getName());
    }
}
