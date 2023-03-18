package P04InterfacesAndAbstractionExercise.P03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Birthable> thingsWithBirthday = new ArrayList<>();

        while (!input.equals("End")){
            String[] tokens = input.split(" ");
            String objectType = tokens[0];
            switch (objectType){
                case "Citizen":
                    String personName = tokens[1];
                    int personAge = Integer.parseInt(tokens[2]);
                    String personId = tokens[3];
                    String personBirthDate = tokens[4];

                    Citizen citizen = new Citizen(personName,personAge,personId,personBirthDate);
                    thingsWithBirthday.add(citizen);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petBirthdate = tokens[2];

                    Pet pet = new Pet(petName,petBirthdate);
                    thingsWithBirthday.add(pet);

                    break;
                case "Robot":
                    break;
            }
            input= scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean isFound = false;
        for (Birthable birthable : thingsWithBirthday) {
            if (birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
                isFound=true;
            }
        }

        if (!isFound){
            System.out.println("<no output>");
        }
    }
}
