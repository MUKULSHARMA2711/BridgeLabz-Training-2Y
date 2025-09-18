import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            
            System.out.print(" Principal amount : ");
            double principal = scanner.nextDouble();

           
            System.out.print("Rate of Interest : ");
            double rate = scanner.nextDouble();

          
            System.out.print(" Time period : ");
            double time = scanner.nextDouble();

            
            double simpleInterest = (principal * rate * time) / 100;

            
            
            System.out.println("Simple Interest = " + simpleInterest);
            System.out.println("Total Amount  = " + (principal + simpleInterest));
            
        }
    }
}

