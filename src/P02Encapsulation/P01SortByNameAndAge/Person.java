package P02Encapsulation.P01SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary=salary;
    }

    String getFirstName() {
        return firstName;
    }

    int getAge() {
        return age;
    }

    public void increaseSalary(double bonus){
        double actualBonus = bonus;
        if (age<30){
            actualBonus/=2;
        }

        double newSalary = salary*(1+actualBonus/100);
        salary=newSalary;
    }

//    @Override
//    public String toString() {
//        return String.format("%s %s is %d years old.",firstName,lastName,age);
//    }


    @Override
    public String toString() {
        return String.format("%S %S gets %.2f leva",firstName,lastName,salary);
    }
}
