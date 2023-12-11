import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.text.*;

/* C211 Project, Group 1 
 * author: Madeline Abbott
 * 11/9/2023
 * Main which implements using a GUI */





public class Main extends Application 
	{
	public static Quiz quiz = new Quiz();

		public void start(Stage stage)
	{
	//Setting title name and Creating VBox to hold questions and answers
	    stage.setTitle("Personality Quiz");
	    VBox quizBox = new VBox();
	    quizBox.setSpacing(8);
	    quizBox.setPadding(new Insets(10));
	    Label questionLabel = new Label("Tell us about yourself!");
	    Label nameLabel = new Label("Name");
	    Label ageLabel = new Label("Age");
	    Label occupationLabel = new Label("Occupation");
	    Button btSubmit = new Button("Submit");
	    
	//Create Necessary Text Fields    
	    TextField name = new TextField("Name");
	    TextField age = new TextField("Age");
	    TextField occupation = new TextField("Occupation");

	//Add to VBox
        quizBox.getChildren().add(questionLabel);
        quizBox.getChildren().add(nameLabel);
        quizBox.getChildren().add(name);
        quizBox.getChildren().add(ageLabel);
        quizBox.getChildren().add(age);
        quizBox.getChildren().add(occupationLabel);
        quizBox.getChildren().add(occupation);
        quizBox.getChildren().add(btSubmit);
	    
	//Creating the scene to output
	  Scene scene = new Scene(quizBox, 300, 300);
	  stage.setScene(scene);
	  stage.show();
	  
	  btSubmit.setOnAction(
	            e -> { 
	            //Add info to profile
	            User user = new User (name.getText(), occupation.getText(), Integer.parseInt(age.getText()));
	            stage.close();
	            questions(0);
	            }); 
	}
		
		public void questions(int index) 
	{
			Stage question = new Stage();
		//Adding necessary variables
			String[] questions = new String[10];	
			questions = quiz.getQuestion();
			final int innerIndex = index;
		//Setting title name and Creating VBox to hold question and answers
		    VBox quizBox = new VBox();
		    quizBox.setSpacing(8);
		    quizBox.setPadding(new Insets(10));
		    Label questionLabel = new Label("Question " + (index+1));
		    Text questionBody = new Text(20, 30, questions[index]);
		//Creating toggleGroup to hold radioButtons
		    ToggleGroup toggleGroup = new ToggleGroup();
		    RadioButton yesRadioButton = new RadioButton("Yes");
		    RadioButton noRadioButton = new RadioButton("No");
		    Button btSubmit = new Button("Submit");
		    yesRadioButton.setToggleGroup(toggleGroup);
		    noRadioButton.setToggleGroup(toggleGroup);    
		//Add to VBox
		    quizBox.getChildren().add(questionLabel);
		    quizBox.getChildren().add(questionBody);
		    quizBox.getChildren().add(yesRadioButton);
		    quizBox.getChildren().add(noRadioButton);
		    quizBox.getChildren().add(btSubmit);
		    
		//Creating the scene to output
		  Scene scene = new Scene(quizBox, 400, 180);
		  question.setScene(scene);
		  question.show();
		  
		  
		  btSubmit.setOnAction(
		      e -> {
		      
		      //store the user responses  
		      if (yesRadioButton.isSelected()) {
		    	  (quiz.getAnswer())[index]=true;
		      }
		      else if (noRadioButton.isSelected()) {
		    	  (quiz.getAnswer())[index]=false;
		      }
		      else {
		    	  error();
		    	  return;
		      }
		      
		      //continue to next question
		      if (innerIndex < 9) {
			  question.close();
		      questions(index+1);
		      }

		      else {
		      question.close();
		      results();
		      }
		      }); 
	}
		
		public void results()
		{
			//Count answers
			boolean[] answers = quiz.getAnswer();
			int sum = 0;
			for (boolean ans : answers) {
				if (ans == true)
					sum++;
			}
			
			//Create buttons
			Button btAgain = new Button("Play Again?");
			Button btQuit = new Button("I'm Done.");
			
			//Create VBox, HBox, and elements 
			Stage results = new Stage();
			VBox resBox = new VBox();
			resBox.setSpacing(8);
			resBox.setPadding(new Insets(10));
			HBox buttons = new HBox();
			buttons.setSpacing(8);
			buttons.setPadding(new Insets(10));
			buttons.setAlignment(Pos.CENTER);
			buttons.getChildren().addAll(btAgain, btQuit);
			resBox.setAlignment(Pos.CENTER);
			Scene scene = new Scene(resBox, 400, 230);
			results.setScene(scene);
			results.show();
			
			
			//Add Labels and descriptions for all possible answers
			Label extrovert = new Label("Extrovert");
			Text extrovertDesc = new Text("You are an extrovert, thriving in social settings "
					+ "\nand drawing energy from interactions with others. "
					+ "\nOutgoing and expressive, you enjoy being the center "
					+ "\nof attention and easily engage in conversations. "
					+ "\nSocial events energize you, and you often seek out "
					+ "\nnew experiences and connections.");
			extrovertDesc.setTextAlignment(TextAlignment.CENTER);
			Label introvert = new Label("Introvert");
			Text introvertDesc = new Text("You are an introvert, finding strength and "
					+ "\nrenewal in moments of solitude. Reserved and "
					+ "\nreflective, you prefer smaller, meaningful "
					+ "\ninteractions over large social gatherings. "
					+ "\nTime alone is essential for recharging your"
					+ "\nenergy, and you excel in focusing deeply on "
					+ "\nyour thoughts and activities.");
			introvertDesc.setTextAlignment(TextAlignment.CENTER);
			Label ambivert = new Label("Ambivert");
			Text ambivertDesc = new Text("You are an ambivert, balancing the qualities "
					+ "\nof both extroversion and introversion. Adaptable and "
					+ "\nflexible, you can navigate social situations with "
					+ "\nease, but also appreciate and value your time alone. "
					+ "\nYour social energy levels fluctuate, allowing you to "
					+ "\nenjoy the best of both worlds, engaging in lively "
					+ "\nconversations and relishing quiet moments as needed.");
			ambivertDesc.setTextAlignment(TextAlignment.CENTER);
			
			
			//Display Answers
			if (sum>5) {
				resBox.getChildren().addAll(extrovert, extrovertDesc, buttons);
			}
			
			if (sum<5) {
				resBox.getChildren().addAll(introvert, introvertDesc, buttons);
			}
			
			if (sum==5) {
				resBox.getChildren().addAll(ambivert, ambivertDesc, buttons);
			}	

				 
		    btAgain.setOnAction(
				e -> {
					results.close();
					questions(0);
				});
		    
		    btQuit.setOnAction(
		        e -> {
		        	results.close();
		        	System.exit(0);
		        });
			}
		
		
		public void error() {
			
			//Create stage and elements
			Stage error = new Stage();
			VBox Box = new VBox();
			Box.setSpacing(8);
			Box.setPadding(new Insets(10));
			Scene scene = new Scene(Box, 400, 180);
			Label errorLabel = new Label("Error");
			Text errorMsg = new Text("It seems you did not select an answer.");
			Button btAgain = new Button("Try Again");
			
			//Set Stage
			Box.getChildren().addAll(errorLabel, errorMsg, btAgain);
			Box.setAlignment(Pos.CENTER);
			error.setScene(scene);
			error.show();
			error.setAlwaysOnTop(true);
			
			 btAgain.setOnAction(
				  e -> {
				       error.close();
				  });
			
		}
		
		public static void main(String[] args) {
			
			
			String[] questions = new String[10];
			quiz.setQuestion(questions);
			questions[0] = "Do you enjoy social gatherings or large crowds?";
			questions[1] = "Are you comfortable initiating conversations with strangers?";
			questions[2] = "Do you make friends easily?";
			questions[3] = "Would your friends describe you as outgoing?";
			questions[4] = "Would you rather communicate in person than through text or emails?";
			questions[5] = "Are your weekends typically booked with plans?";
			questions[6] = "Do you prefer team work over individual tasks?";
			questions[7] = "Do you easily express your opinions?";
			questions[8] = "Do you strive to be around people?";
			questions[9] = "Are you more open in conversations?";
			boolean[] answers = new boolean[10];
			for (int i = 0; i<10; i++) {
				answers[i]=false;
			}
			quiz.setAnswer(answers);
			
			launch(args);
				
			
			}
		    

	}
	
	//public static Quiz quiz = new Quiz();
	
	
	/*public static void main(String[] args) {
	
	//quiz.setQuestion("1. Do you enjoy social gatherings or large crowds?");
	QuizGUI.launch(args);
		
	User one = new User();
	String answer;
    ArrayList<String> answers = new ArrayList<String>();
	}
    
}

	/*
}
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
        }*/
   
            
        
    


