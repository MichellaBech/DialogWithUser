package src;

import java.util.Scanner;

public class Dialog {

    private int currentYear;

    public Dialog (int currentYear)
    {
        this.currentYear = currentYear;
    }

    public void getYearOfBirth()
    {
        Scanner scan = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Please write your year of birth: ");

            int yearOfBirth = scan.nextInt();
            String year = String.valueOf(yearOfBirth);
            if (year.length() != 4 || yearOfBirth < 1900 || yearOfBirth > currentYear) {
                System.out.println("Your birth year is incorret");
            } else {
                int yearsToRetirement = getYearsToRetirement(yearOfBirth);
                System.out.println("You have " + yearsToRetirement + " years until your retirement");
                validInput = true;
            }
        }
    }

    public int getYearsToRetirement (int i)
    {
        int yearsToRetirement = (i + 67) - currentYear;
        return yearsToRetirement;
    }
}
