import java.util.HashMap;

public class AnimalFarm {

    private HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

    public void addToFarm(Animal animal){
        this.animalMap.put(animal.getName(), animal);
    }

    public HashMap<String, Animal> getAnimalMap() {
        return animalMap;
    }
}
