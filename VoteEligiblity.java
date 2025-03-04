import java.util.Scanner;

/**
 * This will check if the user is eligible to vote.
 *
 * @author Tony Tran
 * @version 1.0
 * @since 2025-03-04
 */

final class VoteEligiblity {
    /**
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private VoteEligiblity() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // This will ask the user for their country
            System.out.print("Enter your country "
             + "(USA, Canada, Brazil, Scotland): ");
            String country = scanner.nextLine().toLowerCase();
            // This will check the voting age for the country
            int votingAge = 18;
            if (country.equals("brazil") || country.equals("scotland")) {
                votingAge = 16;
            }
            // This will check if country is in the list
            if (country.equals("brazil")
             || country.equals("scotland") || country.equals("usa")
                    || country.equals("canada")) {
                // This will ask the user for their age
                System.out.print("Enter your age: ");
                int age = Integer.parseInt(scanner.nextLine());
                // This will check if the user is eligible to vote
                if (age >= votingAge) {
                    System.out.println("You are eligible to vote.");
                } else {
                    // This calculate how many years left until user can vote
                    int yearsLeft = votingAge - age;
                    System.out.println("You are not eligible to vote. You have "
                     + yearsLeft + " years left.");
                }
            } else {
                System.out.println("This country is not in the list.");
            }
            scanner.close();
        } catch (NumberFormatException error) {
            System.out.println("This is not an integer. " + error.getMessage());
        }
    }
}
