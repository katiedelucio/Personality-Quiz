import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class QuizGUI extends Application 
{
	public void start(Stage stage)
{
//Setting title name and Creating VBox to hold question and answers
    stage.setTitle("Personality Quiz");
    VBox quizBox = new VBox();
    quizBox.setSpacing(8);
    quizBox.setPadding(new Insets(10));
    Label questionLabel = new Label("Question: "); 
//Creating toggleGroup to hold radioButtons
    ToggleGroup toggleGroup = new ToggleGroup();
    RadioButton yesRadioButton = new RadioButton("Yes");
    RadioButton noRadioButton = new RadioButton("No");

    yesRadioButton.setToggleGroup(toggleGroup);
    noRadioButton.setToggleGroup(toggleGroup);
//Add to VBox
    quizBox.getChildren().add(questionLabel);
    quizBox.getChildren().add(yesRadioButton);
    quizBox.getChildren().add(noRadioButton);
    
//Creating the scene to output
  Scene scene = new Scene(quizBox, 300, 300);
  stage.setScene(scene);
  stage.show();
}
	public static void main(String[] args) {
		
		QuizGUI.launch(args);
			
		
		}
	    

}