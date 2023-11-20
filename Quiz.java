/*PersonalityQuiz, Tiffany Leister, 11/10/2023
Class Quiz that contains the question and answerchoice attributes to later display for user interface*/ 

public class Quiz{
    String question;
    char[] answer;
    
//Constructor
public Quiz(String question, char[] answer)
{
    this.question = question;
    this.answer = answer;
 }
    
//Default Constructor
public Quiz()
    {
        this.question = "";
        this.answer = new char[0];
    }
    
//getter Question
public String getQuestion()
{
return question;
}
    
//setter Question
public void setQuestion(String question)
    {
        this.question = question;
    }
    
//getter Answer
public char[] getAnswer()
{
return answer;
}
    
//setter Answer
public void setAnswer(char[] answer)
{
this.answer = answer;
}
}


    
