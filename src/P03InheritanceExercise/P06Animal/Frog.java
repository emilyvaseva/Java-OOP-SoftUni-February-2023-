package P03InheritanceExercise.P06Animal;

public class Frog extends Animal{
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return "Ribbit";
    }
}