import java.util.Scanner;
public class UserDialogs {
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Choose first letter: ");
            String letter = scanner.nextLine().trim().toUpperCase();
            String colour;
            switch(letter){
                case "A" -> colour = "AQUA";
                case "B" -> colour = "BLACK";
                case "C" -> colour = "CYAN";
                case "D" -> colour = "DON'T KNOW";
                case "E" -> colour = "EBONY";
                case "F" -> colour = "FUCHSIA";
                default -> colour = "SOME ELSE";
            }
            return colour;
    }
}