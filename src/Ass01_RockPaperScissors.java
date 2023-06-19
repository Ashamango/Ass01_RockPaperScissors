import java.util.Scanner;
public class Ass01_RockPaperScissors { // class Ass01_RockPaperScissors
    public static void main(String[] args) { // main

        Scanner in = new Scanner(System.in);
        String playerA = ""; // String playerA = ""
        String playerB = ""; // String playerB = ""
        String answer = ""; // String answer = ""
        boolean done = false; // boolean done = false
        boolean done1 = false; // boolean done1 = false

        do { // do
            do { // do
                System.out.print("PlayerA enter a move (R, P, or S): ");// output "PlayerA enter a move (R, P, or S): "
                if (in.hasNext("R|P|S|r|p|s")) // if input == "R|P|S|r|p|s
                {
                    playerA = in.nextLine(); // input playerA
                    done = true; // done = true

                }
                else // else
                {
                    System.out.println("This is an invalid input for playerA. Please input P for paper, S for scissors, or R for rock."); // output "This is an invalid input for playerA. Please input P for paper, S for scissors, or R for rock."
                    in.nextLine(); // clear buffer
                }
            }
            while (!done) ; // while done is false

            do { // do
                System.out.print("PlayerB enter a move (R, P, or S): "); // output "PlayerB enter a move (R, P, or S): "
                if (in.hasNext("R|P|S|r|p|s")) // if input == "R|P|S|r|p|s
                {
                    playerB = in.nextLine(); // input playerB
                    done1 = true; // done = true
                }
                else // else
                {
                    System.out.println("This is an invalid input for playerB. Please input P for paper, S for scissors, or R for rock."); // output "This is an invalid input for playerB. Please input P for paper, S for scissors, or R for rock."
                    in.nextLine(); // clear buffer
                }
            } while (!done1); // while done1 is false
            if (playerA.equalsIgnoreCase("P")) // if playerA == "P" then
            {
                if (playerB.equalsIgnoreCase("P")) // if playerB == "P" then
                {
                    System.out.println("Paper vs Paper, it's a tie!"); // output "Paper vs Paper. it's a tie!"
                }
                else if (playerB.equalsIgnoreCase("R"))  // else if playerB == "R" then
                {
                    System.out.println("Paper covers Rock, so playerA wins!"); // output "Paper covers Rock, so playerA wins!"
                }
                else // else
                {
                    System.out.println("Scissors cuts Paper, so playerB wins!"); // output "Scissors cuts Paper, so playerB wins!"
                }
            }
            else if (playerA.equalsIgnoreCase("R")) // else if playerA == "R" then
            {
                if (playerB.equalsIgnoreCase("R")) // if playerB == "R" then
                {
                    System.out.println("Rock vs Rock, it's a tie!"); // output "Rock vs Rock, it's a tie!"
                }
                else if (playerB.equalsIgnoreCase("P")) // else if playerB == "P" then
                {
                    System.out.println("Paper covers Rock, so playerB wins!"); // output "Paper covers Rock, so playerB wins!"
                }
                else // else
                {
                    System.out.println("Rock breaks Scissors, so playerA wins!"); //output "Rock breaks Scissors, so playerA wins!"
                }
            }
            else // else
            {
                if (playerB.equalsIgnoreCase("S")) // if playerB == "S" then
                {
                    System.out.println("Scissors vs scissors, it's a tie!"); // output "Scissors vs Scissors, it's a tie!"
                }
                else if (playerB.equalsIgnoreCase("P")) // else if playerB == "P" then
                {
                    System.out.println("Scissors cuts Paper, so playerA wins!"); // output "Scissors cuts Paper, so playerA wins!"
                }
                else // else
                {
                    System.out.println("Rock breaks Scissors, so playerB wins!"); // output "Rock breaks Scissors, so playerB wins!"
                }
            }
            done = false; // done = false
            done1 = false; // done1 = false

            System.out.print("Do you want to continue playing [Y or N]: "); //output "Do you want to continue playing [Y or N]: "
            answer = in.nextLine(); // input answer
        } while (answer.equalsIgnoreCase("Y")); // while answer == "Y"
    } // return
}// end class