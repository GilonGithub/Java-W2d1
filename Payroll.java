import java.util.Scanner;
import java.lang.String;

public class Payroll {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        float hoursWorked = input.nextFloat();

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();

        double grossPay = hoursWorked * hourlyRate;

        System.out.print("Enter federal tax witholding rate: ");
        double fedRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("\tFederal Withholding (" + (fedRate * 100) + "%): $" + (Math.floor((grossPay * fedRate) * 100) / 100));
        System.out.println("\tState Withholding (" + (stateRate * 100) + "%): $" + (Math.floor((grossPay * stateRate) * 100) / 100));
        double deductions = Math.floor(((grossPay * fedRate) + (grossPay * stateRate)) * 100) / 100;
        System.out.println("\tTotal Deduction: $" + deductions);
        System.out.println("Net Pay: $" + Math.floor((grossPay - deductions) * 100) / 100);
    }
}
