/*PersonalityQuiz, Tiffany Leister, 11/10/2023
Class Quiz that contains the question and answerchoice attributes to later display for user interface*/ 

public class Quiz{
    String[] questions;
    boolean[] answer;
    
//Constructor
public Quiz(String[] questions, boolean[] answer)
{
    this.questions = questions;
    this.answer = answer;
 }
    
//Default Constructor
public Quiz()
    {
        this.questions = null;
        this.answer = null;
    }
    
//getter Question
public String[] getQuestion()
{
return questions;
}
    
//setter Question
public void setQuestion(String[] question)
    {
        this.questions = question;
    }
    
//getter Answer
public boolean[] getAnswer()
{
return answer;
}
    
//setter Answer
public void setAnswer(boolean[] answer)
{
this.answer = answer;
}
}


    
