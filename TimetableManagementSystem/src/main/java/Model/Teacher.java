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

    public Teacher(String userId, String name, String email, String teacherId) {
        super(userId, name, email, "TEACHER");
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }
}
