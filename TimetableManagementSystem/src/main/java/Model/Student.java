/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kabil
 */
public class Student extends User {
    
    private final String className;

    public Student(String userId, String name, String email, String className) {
        super(userId, name, email, "STUDENT");
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
