package P01WorkingWithAbstraction.P03StudentSystem;

public class Student {
    private final String name;
    private final int age;
    private final double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
            String studentType="Very nice person.";

            if (this.getGrade()>=5.00){
                studentType="Excellent student.";
            }else if (this.getGrade()<5.00&&this.getGrade()>=3.50){
                studentType = "Average student.";
            }

            return String.format("%s is %d years old. %s", this.getName(), this.getAge(),studentType);
    }
}
