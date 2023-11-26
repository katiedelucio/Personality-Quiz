<<<<<<< HEAD
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
=======
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        User one = new User();
        //user info entered
        System.out.println("What is your name?");
        String name = scan.nextLine();
        one.setName(name);
        System.out.println("What is your occupation?");
        String job = scan.nextLine();
        one.setOccupation(job);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        scan.nextLine();
        one.setAge(age);
        

        Quiz quiz = new Quiz();

        String answer;
        ArrayList<String> answers = new ArrayList<String>();

        //ask questions, get answers from user input, add answers to arraylist
        System.out.println("Please answer yes or no to each question.");
        quiz.setQuestion("1. Do you enjoy social gatherings or large crowds?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("2. Are you comfortable initiating conversations with strangers?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("3. Do you make friends easily?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("4. Would your friends decribe you as outgoing?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("5. Would you rather communicate in person than through text or emails?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("6. Are your weekends typically booked with plans?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("7. Do you prefer teamwork over individual tasks?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("8. Do you easily express your opinions?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("9. Do you strive to be around people?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("10. Are you more open in conversations?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        //display user info
        one.output();
        //prints all answers added to arraylist - test to make sure added to list
        //System.out.println ("Your answers: " + answers);
       
        //count number of "yes" answers
        String yes = "yes";
        int count = 0;
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equalsIgnoreCase(yes)) {
             count++;   
            }           
        }
        
        if (count >= 5)
            System.out.println("You are an extrovert.");
        else
            System.out.println("You are an introvert.");
        }
   
            
        
        
            
>>>>>>> 2a00092ba02a59e6fa68de35582408551a859cd8
    }


