import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        // Declare scanner objetc to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        String ageType;
        if (age >= 20){
            ageType = "Adult";
        } else if (age >= 13){
            ageType = "Teenager";
        } else {
            ageType= "Child";
        }

        System.out.println("Your are an " + ageType);
    }
}
