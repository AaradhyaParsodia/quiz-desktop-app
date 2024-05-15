/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.pojo;

import java.util.ArrayList;

/**
 *
 * @author aaradhya
 */
public class QuestionStore {

    @Override
    public String toString() {
        return "QuestionStore{" + "questionList=" + questionList + '}';
    }
    
    ArrayList <Questions> questionList;
    
    public QuestionStore()
    {
        questionList = new ArrayList<>();
    }
    
    public void addQuestion(Questions ques)
    {
        questionList.add(ques);
    }
    public Questions getQuestion(int postn)
    {
        return questionList.get(postn);
    }
    public Questions getQuestionByQno(int quesNo)
    {
        for(Questions ques : questionList){
            if(ques.getQuesNo() == quesNo){
                return ques;
            }
        }
        return null;
    }
    public void removeQuestion(int postn)
    {
        questionList.remove(postn);
    }
    public void setQuestionAt(int postn, Questions ques)
    {
        questionList.add(postn, ques);
    }
    public ArrayList<Questions> getAllQuestion()
    {
        return questionList;
    }
    public int getCount()
    {
        return questionList.size();
    }
}
