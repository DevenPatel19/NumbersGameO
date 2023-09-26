/* users have been reporting bugs. The goal of the application is to present the user with a 
number between 0 and 10 and have them guess it. */

/* 1). Users have reported the following bugs:

-The app works fine as long as I type numbers or the letter 'q' to quit. 
	But typing anything else makes it crash. 
	? Fix the 'user input' bug.
-Why am I able to guess numbers smaller than 0 and larger than 10 
	if I'm only supposed to guess a number between 0 and 10?
	? Fix the bug that allows users to guess numbers lower than 0 and greater than 10.
-Sometimes I guess a number and it is wrong, 
	then if I guess that same number later it is correct.
	? Fix the 'inconsistency' bug.
	*/


import java.util.Random;

public class NumbersGame {
    public static void main(String[] args){
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");
        
            int answer = new Random().nextInt(0,10);
		
		while(true){
            String guess = System.console().readLine();

            if(guess.equals("q")){
                System.out.println("I knew you didn't have it in you.");
                System.out.println("Shutting down...");
                break;
            }
        
		try{
			if(Integer.parseInt(guess)<0 || Integer.parseInt(guess)>10){
				System.out.println("Your number is not between 0 and 10...");
			}else if(Integer.parseInt(guess)==answer){
                System.out.println("Lucky guess! But can you do it again?");
                break;
            }else{
                System.out.println("Swing and a miss! Keep trying...");
            }
		}catch(NumberFormatException n){
			System.out.println("A letter is not a number...");
		}
        }
        System.out.println("Game over. Shutting down...");
    }
}

