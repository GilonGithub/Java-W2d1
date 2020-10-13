import java.util.Scanner;
import java.lang.String;

public class VowelOrConsonant {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if(Character.isLetter(letter)) {
            char formattedLetter = Character.toUpperCase(letter);

            if(formattedLetter == 'A' || formattedLetter == 'E' || formattedLetter == 'I' || formattedLetter == 'O' || formattedLetter == 'U') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }

    }
}