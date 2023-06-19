import java.util.Scanner;
public class Ass01_RockPaperScissors {
    public static void main(String[] args) { // main

        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String answer = "";
        boolean done = false;
        boolean done1 = false;

        do {
            do {
                System.out.print("PlayerA enter a move (R, P, or S): ");// output "Please enter the measurement in meters: "
                if (in.hasNext("R|P|S|r|p|s")) {
                    playerA = in.nextLine();
                    done = true; // done = true

                } else { // else
                    System.out.println("This is an invalid input for playerA. Please input P for paper, S for scissors, or R for rock."); // output "This is an invalid number of gallons. Please input a correct number."
                    in.nextLine(); // clear buffer
                }
            }
            while (!done) ; // while done is false

            do {
                System.out.print("PlayerB enter a move (R, P, or S): ");// output "Please enter the measurement in meters: "
                if (in.hasNext("R|P|S|r|p|s")) {
                    playerB = in.nextLine();
                    done1 = true; // done = true
                } else { // else
                    System.out.println("This is an invalid input for playerB. Please input P for paper, S for scissors, or R for rock."); // output "This is an invalid number of gallons. Please input a correct number."
                    in.nextLine(); // clear buffer
                }
            } while (!done1); // while done1 is false
            if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie"); // output "It's a tie"
                } else if (playerB.equalsIgnoreCase("R"))  // else if playerB == "R" then
                {
                    System.out.println("P covers R, so playerA wins!"); // output "P covers R, so playerA wins!"
                } else {
                    System.out.println("S cuts P, so playerB wins!"); // output "S cuts P, so playerB wins!"
                }
            } else if (playerA.equalsIgnoreCase("R")) { // else if playerA == "R" then
                if (playerB.equalsIgnoreCase("R")) // if playerB == "R" then
                {
                    System.out.println("It's a tie"); // output "It's a tie"
                } else if (playerB.equalsIgnoreCase("P")) // if playerB == "P"
                {
                    System.out.println("P covers R, so playerB wins!"); // output "P covers R, so playerB wins!"
                } else // else
                {
                    System.out.println("R breaks S, so playerA wins!"); //output "R breaks S, so playerA wins!"
                }
            } else {
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("It's a tie"); // output "It's a tie"
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("S cuts P, so playerA wins!"); // output "S cuts P, so playerA wins!"
                } else {
                    System.out.println("R breaks S, so playerB wins!"); // output "R breaks S, so playerB wins!"
                }
            }
            done = false;
            done1 = false;

            System.out.print("Do you want to continue playing [Y or N]: ");
            answer = in.nextLine();
        } while (answer.equalsIgnoreCase("Y"));
    }
}// end class