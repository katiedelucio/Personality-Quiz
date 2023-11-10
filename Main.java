import java.util.Scanner;

public class Main {
	
	public static int introvertSum, extrovertSum;
	
	public static void readAnswer(String answer) {
		answer.toLowerCase();
		answer.toCharArray();
		if (answer.charAt(0) == 'a') {
			extrovertSum++;
		}
		if (answer.charAt(0) == 'b') {
			introvertSum++;
		}
		else {
			System.out.println("Please enter a valid input.");
		}
		
	}

    public static void main(String[] args) {
    	
       User one = new User("Katie", "Tech", 42);
       one.output();
       PersonalityQuiz quiz = new PersonalityQuiz();
       String question = quiz.getQuestion();
       System.out.println("Question: " + question);
       Scanner scan = new Scanner(System.in);
       String answer = scan.next();
       readAnswer(answer);
    }

}
