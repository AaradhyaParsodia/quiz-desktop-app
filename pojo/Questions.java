/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.pojo;

import java.util.Objects;

/**
 *
 * @author aaradhya
 */
public class Questions {

    @Override
    public String toString() {
        return "Questions{" + "examId=" + examId + ", quesNo=" + quesNo + ", question=" + question + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + ", language=" + language + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Questions other = (Questions) obj;
        if (this.quesNo != other.quesNo) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer1, other.answer1)) {
            return false;
        }
        if (!Objects.equals(this.answer2, other.answer2)) {
            return false;
        }
        if (!Objects.equals(this.answer3, other.answer3)) {
            return false;
        }
        if (!Objects.equals(this.answer4, other.answer4)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        return true;
    }

    public Questions() {
        
    }

    public Questions(String examId, int quesNo, String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String language) {
        this.examId = examId;
        this.quesNo = quesNo;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
        this.language = language;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getQuesNo() {
        return quesNo;
    }

    public void setQuesNo(int quesNo) {
        this.quesNo = quesNo;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    private String examId;
    private int quesNo;
    private String question;
    private String answer1, answer2, answer3, answer4;
    private String correctAnswer;
    private String language;
}
