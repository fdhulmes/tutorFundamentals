public abstract class Animal implements Eater, Named {
    protected String name;
    private Integer age;

    public Animal(){
    }

    public Animal(String inputName, Integer inputAge){
        this.name = inputName;
        this.age = inputAge;
    }

    public Animal(String inputName){
        this(inputName, 0);
    }

    public Animal(Integer inputAge) {
        this("name", inputAge);
    }








}
