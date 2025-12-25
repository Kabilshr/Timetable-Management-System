/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kabil
 */
public class Teacher extends User {
    private String teacherId;

    public Teacher(String userId, String name, String email) {
        super(userId, name, email, "TEACHER");
        this.teacherId = userId;
    }

    public String getTeacherId() {
        return teacherId;
    }
    
    // Setter for teacherId
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    // Getter for name (inherited from User)
    @Override
    public String getName() {
        return super.getName();
    }

    // Setter for name
    public void setName(String name) {
        super.name = name;
    }

    // Getter for email (inherited from User)
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    // Setter for email
    public void setEmail(String email) {
        super.email = email;
    }
}
