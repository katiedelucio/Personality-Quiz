import java.util.Scanner;

public class Main {
	
	public static PersonalityQuiz[] questions = new PersonalityQuiz[10];
	
	public static void readAnswer(String answer, int i) { 
		
		boolean flag = false;
		
		do {
		
		answer.toLowerCase();
		answer.toCharArray();
		if (answer.charAt(0) == 'a') {
			questions[i].setAnswer('a');
		}
		if (answer.charAt(0) == 'b') {
			questions[i].setAnswer('b');
		}
		else {
			System.out.println("Please enter a valid input.");
		}
		} while(flag==false);
	}

    public static void main(String[] args) {
    	
       /* User one = new User("Katie", "Tech", 42);
       one.output(); */ 
    	
       User two = new User();
       
       Scanner scan = new Scanner(System.in);
       boolean flag = false;
       
       do {
       System.out.println("Please enter your name: ");
       two.setName(scan.next());
       System.out.println("Now enter your age: ");
       two.setAge(scan.nextInt());
       System.out.println("Now enter your occupation: ");
       two.setOccupation(scan.next());
       
       System.out.println("Great. Does this look right? (Answer 'Y' for yes or 'N' for no) ");
       two.output();
       
       if (!(scan.next()).equalsIgnoreCase("Y")){
    	   System.out.println("Please try again.");
       }
       else {
    	   flag = true;
       }
       } while (flag==false);
      
       
       for (int i = 0; i<questions.length; i++) {
    	   questions[i] = new PersonalityQuiz();
    	   questions[i].setNumber(i+1);
       }
       
       questions[0].setQuestions("q1");
       questions[1].setQuestions("q2");
       questions[2].setQuestions("q3");
       questions[3].setQuestions("q4");
       questions[4].setQuestions("q5");
       questions[5].setQuestions("q6");
       questions[6].setQuestions("q7");
       questions[7].setQuestions("q8");
       questions[8].setQuestions("q9");
       questions[9].setQuestions("q10");
       
       for(int i=0; i<questions.length; i++) {
       System.out.println("Question " + questions[i].getNumber() + ": " + questions[i].getQuestion());
       
       
       do {
    	System.out.println("Please answer A or B: ");
        scan.nextLine();
        String answer = scan.next();
   		answer.toLowerCase();
   		answer.toCharArray();
   		if (answer.charAt(0) == 'a') {
   			questions[i].setAnswer('a');
   			flag = true;
   		}
   		if (answer.charAt(0) == 'b') {
   			questions[i].setAnswer('b');
   			flag = true;
   		}
   		else {
   			System.out.println("Please enter a valid input.");
   			flag = false;
   		}
   		
   		} while(flag==false);
       
       }
    }

}
