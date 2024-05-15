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
public class Answer {
    
    private String examId;
    private String subject;
    private int qNo;
    private String choosenAnswer;
    private String  correctAnswer;

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        return hash;
//    }

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
        final Answer other = (Answer) obj;
        if (this.qNo != other.qNo) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.choosenAnswer, other.choosenAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Answer{" + "examId=" + examId + ", subject=" + subject + ", qNo=" + qNo + ", choosenAnswer=" + choosenAnswer + ", correctAnswer=" + correctAnswer + '}';
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getQno() {
        return qNo;
    }

    public void setqNo(int qNo) {
        this.qNo = qNo;
    }

    public String getChoosenAnswer() {
        return choosenAnswer;
    }

    public void setChoosenAnswer(String choosenAnswer) {
        this.choosenAnswer = choosenAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Answer() {
    }

    public Answer(String examId, String subject, int qNo, String choosenAnswer, String correctAnswer) {
        this.examId = examId;
        this.subject = subject;
        this.qNo = qNo;
        this.choosenAnswer = choosenAnswer;
        this.correctAnswer = correctAnswer;
    }
}
