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
        one.output();

        Quiz quiz = new Quiz();

        String answer;
        ArrayList<String> answers = new ArrayList<String>();

        //ask questions, get answers from user input, add answers to arraylist
        
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
        
        quiz.setQuestion("4. Would your friends decribe you as reserved?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("5. Would you rather communicate through text or emails than over the phone?");
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
        
        quiz.setQuestion("8. Do you have reservations when expressing your opinions?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("9. Do you feel as if you have a social battery?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        quiz.setQuestion("10. Are you more open in conversations?");
        System.out.println("Question: " + quiz.getQuestion());
        answer = scan.nextLine();
        answers.add(answer);
        
        //prints all answers added to arraylist
        System.out.println(answers);
    }

}
