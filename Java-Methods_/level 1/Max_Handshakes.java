import java.util.Scanner;

public class Max_Handshakes{

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();

            if (numberOfStudents < 2) {
                System.out.println("At least 2 students are required for a handshake!");
            } else {
                int maxHandshakes = calculateHandshakes(numberOfStudents);
                
                System.out.println("Number of students: " + numberOfStudents);
                System.out.println(" Max possible handshakes = " + maxHandshakes);
                
            }
        }
    }
}
