/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.pojo;

/**
 *
 * @author aaradhya
 */
public class StudentResult {

    private String language;
    private double percentage;
    
    public StudentResult() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public StudentResult(String language, double percentage) {
        this.language = language;
        this.percentage = percentage;
    }
}
