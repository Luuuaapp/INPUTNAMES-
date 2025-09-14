import java.util.Scanner;
public class Piste {
    public static void main(String [] args) {
        String name;
        String color;   
        String place;
        String national;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        color = scanner.nextLine();   // use 'color'

        System.out.print("Enter your favorite place: ");
        place = scanner.nextLine();

        System.out.print("Enter your nationality: ");
        national = scanner.nextLine();
        

        System.out.println("Hello, " + name + "! Your favorite color is " + color +
         ", your favorite place is " + place + ", and you are " + national + ".");
        scanner.close();
    }
}
