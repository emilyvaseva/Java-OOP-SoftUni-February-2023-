package P02Encapsulation.P01SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public Person(String firstName, String lastName, int age,double salary) {
        this(firstName, lastName, age);
        setSalary(salary);
    }

    private void setFirstName(String firstName) {
        if (firstName.length()<3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length()<3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age<1){
            throw new IllegalArgumentException("Age cannot be negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary<460){
            throw new IllegalArgumentException("Salary cannot be less than 400 leva");
        }
        this.salary = salary;
    }

    String getFirstName() {
        return firstName;
    }

     public int getAge() {
        return age;
    }

    public void increaseSalary(double bonus){
        double actualBonus = bonus;
        if (age<30){
            actualBonus/=2;
        }

        double newSalary = salary*(1+actualBonus/100);
        setSalary(newSalary);
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
