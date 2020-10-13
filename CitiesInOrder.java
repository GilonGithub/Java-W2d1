import java.lang.String;
import java.util.Scanner;


public class CitiesInOrder {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        if(firstCity.charAt(0) >= secondCity.charAt(0)) {
            if (secondCity.charAt(0) >= thirdCity.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + thirdCity + " " + secondCity + " " + firstCity);
            } else if(thirdCity.charAt(0) >=  firstCity.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + secondCity + " " + firstCity + " " + thirdCity);
            } else if(firstCity.charAt(0) >= thirdCity.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + secondCity + " " + thirdCity + " " + firstCity);
            }
        } else {
            if(thirdCity.charAt(0) >= secondCity.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity);
            } else if(thirdCity.charAt(0) >= firstCity.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + firstCity + " " + thirdCity + " " + secondCity);
            } else if(firstCity.charAt(0) >= thirdCity.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + thirdCity + " " + firstCity + " " + secondCity);
            }
        }

        

        // byte minLen = (byte) Math.min(Math.min(firstCity.length(), secondCity.length()), thirdCity.length());

        // System.out.println(minLen);

        // for(byte i = 0; i < minLen; i++) {
        //     if(firstCity.charAt(i) > secondCity.charAt(i) && first == 0) {
        //         if(firstCity.charAt(i) > thirdCity.charAt(i)) {
        //             first = 1;
        //         }
        //     } else if(secondCity.charAt(i) > firstCity.charAt(i) && second == 0) {
        //         if(secondCity.charAt(i) > thirdCity.charAt(i) {
        //             second = 1;
        //         }
        //     }
        // }



    }
}
