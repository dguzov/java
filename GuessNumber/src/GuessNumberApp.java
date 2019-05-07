public class GuessNumberApp {
    
    public static void main(String[] args) {
        Game game = new Game();
        game.displayWelcomeMessage();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // generate a random number and invite user to guess it
            game.generateNumberToBeGuessed();
            game.displayPleaseGuessMessage();

            // continue until the user guesses the number
            while (!game.isCorrectGuess()) {
                // pass guess from user to Game object
                int guessNumber = Console.getIntWithinRange("Enter number: ", 0, 101);
                game.makeGuess(guessNumber);

                // display result of guess to user
                if (game.isCorrectGuess()) {
                    game.displayCorrectGuessMessage();
                } else {
                    game.displayGuessAgainMessage();
                } 
            }

            // see if the user wants to continue
            choice = Console.getChoiceString("Try again? (y/n): ", "y", "n");
            System.out.println();
        }
        System.out.println("Bye - Come back soon!");
        System.out.println();
    }

}