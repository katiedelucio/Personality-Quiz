/* C211 Project, Group 1 
 * author: Madeline Abbott
 * 11/9/2023
 * PersonalityQuiz class to create and hold question and answer information for the quiz */
public class PersonalityQuiz{
	
    String question;
    char answer;
    
    // default constructor
    public PersonalityQuiz() {
    	question = "";
    	answer = 0;
    }

    // constructor with values
    public PersonalityQuiz(String question, char answer)
    {
    this.question = question;
    this.answer = answer;
    }
    
    // Set and get methods for PersonalityQuiz question attributes
    public void setQuestions(String question)
    {
    	this.question = question;
    }
    public String getQuestion()
    {
    	return question;
    }

    public void setAnswer(char answer)
    {
    	this.answer = answer;
    }

    public char getAnswer()
    {
    	return answer;
    }

}
