import java.util.Scanner;
public class Main {
public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        User one = new User();
        System.out.println ("What is your name?");
        String name = scan.nextLine();
        one.setName(name);
        System.out.println("What is your occupation?");
        String job = scan.nextLine();
        one.setOccupation(job);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        one.setAge(age);
        one.output();
        
        Quiz quiz = new Quiz();
        String question = quiz.getQuestion();
        char[] answer = quiz.getAnswer();
        System.out.println("Question: " + question);

        quiz.setQuestion("1. Do you enjoy social gatherings or large crowds?");
        quiz.setQuestion("2. Are you comfortable initiating conversations with strangers?");
        quiz.setQuestion("3. Do you make friends easily?");
        quiz.setQuestion("4. Would your friends decribe you as reserved?");
        quiz.setQuestion("5. Would you rather communicate through text or emails than over the phone?");
        quiz.setQuestion("6. Are your weekends typically booked with plans?");
        quiz.setQuestion("7. Do you prefer teamwork over individual tasks?");
        quiz.setQuestion("8. Do you have reservations when expressing your opinions?");
        quiz.setQuestion("9. Do you feel as if you have a social battery?");
        quiz.setQuestion("10. Are you more open in conversations?");
    }

}
