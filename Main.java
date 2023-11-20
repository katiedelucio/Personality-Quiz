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

        quiz.setQuestion("1.");
        quiz.setQuestion("2.");
        quiz.setQuestion("3.");
        quiz.setQuestion("4.");
        quiz.setQuestion("5.");
        quiz.setQuestion("6.");
        quiz.setQuestion("7.");
        quiz.setQuestion("8.");
        quiz.setQuestion("9.");
        quiz.setQuestion("10.");
    }

}
