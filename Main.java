/* C211 Project, Group 1 
 * author: Madeline Abbott
 * 11/9/2023
 * Main which implements using a GUI */

import java.util.Scanner;
import java.util.ArrayList;

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
   
            
        
        

    }


