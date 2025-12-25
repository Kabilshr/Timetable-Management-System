/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kabil
 */
public class Subject {
    private final String subjectCode;
    private final String subjectName;

    public Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    // Getter for subjectCode
    public String getSubjectCode() {
        return subjectCode;
    }
    
    // Getter for subjectName
    public String getSubjectName() {
        return subjectName;
    }
}
