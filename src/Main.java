import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number between 1 and 10: ");
            try{
                int number = scanner.nextInt();
                switch (number) {
                    case 1 -> System.out.println("one");
                    case 2 -> System.out.println("two");
                    case 3 -> System.out.println("three");
                    case 4 -> System.out.println("four");
                    case 5 -> System.out.println("five");
                    case 6 -> System.out.println("six");
                    case 7 -> System.out.println("seven");
                    case 8 -> System.out.println("eight");
                    case 9 -> System.out.println("nine");
                    case 10 -> System.out.println("ten");
                    default -> {
                        System.out.println(" Cannot give you the name");
                        System.exit(0);
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("Not a number");
                break;
            }
        }
    }
}
