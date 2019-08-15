import java.util.*;

public class oddsOrEvens {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play a game called 'Odds and Evens'");
        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.print("Hi " + name + ", which do you choose? Odds or Evens? ");
        String choice = scan.next();
        while ((!"odds".equalsIgnoreCase(choice)) && (!"evens".equalsIgnoreCase(choice))) {
            System.out.print("Please select 'odds' or 'evens' ");
            choice = scan.next();
        }
        String compChoice;
        if ("evens".equals(choice)) {
            compChoice = "odds";
        } else {
            compChoice = "evens";
        }

        System.out.println(name + " has picked " + choice + "! The computer will be " + compChoice + ".");
        System.out.println("---------------------------------------");
        System.out.print("How many 'fingers' are you going to play? ");
        int playerNum = scan.nextInt();
        Random rand = new Random();
        int compNum = rand.nextInt(6);
        System.out.println("The computer played " + compNum + " fingers.");
        System.out.println("---------------------------------------");
        int sum = playerNum + compNum;
        System.out.println("The sum of your two numbers is " + sum);
        boolean even = (sum % 2 ==0);
        if (even) {
            System.out.println("The result is even!");
            if ("evens".equalsIgnoreCase(choice)) {
                System.out.println("The user wins!");
            } else {
                System.out.println("The computer wins!");
            }
        } else {
            System.out.println("The result is odd!");
            if ("odds".equalsIgnoreCase(choice)) {
                System.out.println("The user wins!");
            }else {
                System.out.println("The computer wins!");
            }
        }
        System.out.println("---------------------------------------");
    }
}
