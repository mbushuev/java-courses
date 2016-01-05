import java.util.Scanner;

/**
 * Class for running calculator. Maintaining user enter.
 */

public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg: ");
                String first = reader.next();
                System.out.println("Enter second arg: ");
                String second = reader.next();
                boolean makeChange = false;
                while(!makeChange) {
                    System.out.println("Change operation:");
                    System.out.println("1. Sum");
                    System.out.println("2. Difference");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponential");
                    System.out.println("6. Exit");
                    String change = reader.next();
                    switch (change) {
                        case "1": {
                            calc.add(Integer.valueOf(first), Integer.valueOf(second));
                            System.out.println("Sum is: " + calc.getResult());
                            makeChange = true;
                            break;
                        }
                        case "2": {
                            calc.diff(Integer.valueOf(first), Integer.valueOf(second));
                            System.out.println("Difference is: " + calc.getResult());
                            makeChange = true;
                            break;
                        }
                        case "3": {
                            calc.multi(Integer.valueOf(first), Integer.valueOf(second));
                            System.out.println("Multiplication is: " + calc.getResult());
                            makeChange = true;
                            break;
                        }
                        case "4": {
                            calc.div(Integer.valueOf(first), Integer.valueOf(second));
                            System.out.println("Result of division is: " + calc.getResult());
                            makeChange = true;
                            break;
                        }
                        case "5": {
                            calc.pow(Integer.valueOf(first), Integer.valueOf(second));
                            System.out.println("Result of exponential second^first is: " + calc.getResult());
                            makeChange = true;
                            break;
                        }
                        case "6": {
                            System.out.println("Change exit, good bye!");
                            return;
                        }
                        default: {
                            System.out.println("Not change one operation");
                        }
                    }
                }
                System.out.println("Clean result or not? yes/no");
                String clean = reader.next();
                if (clean.equals("yes")){
                    calc.cleanResult();
                }
                System.out.println("Exit: yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}