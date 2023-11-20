/* C211 Project, Group 1 
 * author: Madeline Abbott
 * 11/9/2023
 * PersonalityQuiz class to create and hold question and answer information for the quiz */
public class PersonalityQuiz{
	
    String question;
    char answer;
    int number;
    
    // default constructor
    public PersonalityQuiz() {
    	question = "";
    	answer = 0;
    	
    }

    // constructor with values
    public PersonalityQuiz(String question, int number, char answer)
    {
    this.question = question;
    this.answer = answer;
    this.number = number;
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
     
    public void setNumber(int number) 
    {
    	 this.number = number;
    }
    
    public int getNumber() {
    	return number;
    }
    

}
